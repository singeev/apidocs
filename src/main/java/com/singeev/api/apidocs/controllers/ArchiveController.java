package com.singeev.api.apidocs.controllers;

import com.singeev.api.apidocs.entities.Claim;
import com.singeev.api.apidocs.entities.ClaimSearch;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/archive")
@Api(description="Claims archive manipulations")
public class ArchiveController {

    @ApiOperation(value = "Open claim archive page")
    @RequestMapping(method = RequestMethod.GET, produces = "text/html")
    public String showClaimArchivePage() {
        return "archive";
    }

    @ApiOperation(value = "Get claim by ID")
    @RequestMapping(value="/getClaim/{id}", method= RequestMethod.GET, produces = "application/json")
    public Claim getClaimByID(@PathVariable Integer id, Model model){
        return new Claim();
    }

    @ApiOperation(value = "Retrieve all claims list")
    @RequestMapping(value = "/getAllClaims", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Claim> getAgentsList() {
        return null;
    }

    @ApiOperation(value = "Search claims by filter")
    @RequestMapping(value = "/searchClaim", method = RequestMethod.POST, produces = "application/json")
    public Iterable<Claim> search(@RequestBody ClaimSearch filter) {
        return new ArrayList<>();
    }
}
