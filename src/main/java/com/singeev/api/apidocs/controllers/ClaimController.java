package com.singeev.api.apidocs.controllers;

import com.singeev.api.apidocs.entities.Agent;
import com.singeev.api.apidocs.entities.Claim;
import com.singeev.api.apidocs.entities.Confirmation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/claims")
@Slf4j
@Api(description="Operations with claims")
public class ClaimController {

    @ApiOperation(value = "Open new claim creation page")
    @RequestMapping(value = "/create", method = RequestMethod.GET, produces = "text/html")
    public String newClaimPage() {
        LOGGER.info("Got request /createClaim");
        return "newClaim";
    }

    @ApiOperation(value = "Retrieve agents list")
    @RequestMapping(value = "/getAgents", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Agent> getAgentsList() {
        return null;
    }

    @ApiOperation(value = "Create new claim")
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity createNewClaim(@RequestBody Claim claim){
        return new ResponseEntity("New claim successfully created", HttpStatus.OK);
    }

    @ApiOperation(value = "Confirm existing claim")
    @RequestMapping(value = "/confirmClaim/{id}", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity confirmClaim(@RequestBody Confirmation confirmation){
        return new ResponseEntity("Claim successfully confirmed", HttpStatus.OK);
    }

    @ApiOperation(value = "Create new claim from *.xls template")
    @RequestMapping(value="/exportClaim", method=RequestMethod.POST, produces = "application/json")
    public Claim excelFileUpload(@RequestParam("file") MultipartFile excelExport){
        return new Claim();
    }

    @ApiOperation(value = "Download *.xls template for new claim creation")
    @RequestMapping(value = "/getExcelTemplate", method = RequestMethod.GET, produces = "application/vnd.ms-excel")
    public FileSystemResource getFile() {
        String path = "";
        File file = new File(path);
        return new FileSystemResource(file);
    }

    @ApiOperation(value = "Get claim by ID")
    @RequestMapping(value="/getClaim/{id}", method=RequestMethod.GET, produces = "application/json")
    public Claim getClaimByID(@PathVariable Integer id, Model model){
        return new Claim();
    }



}
