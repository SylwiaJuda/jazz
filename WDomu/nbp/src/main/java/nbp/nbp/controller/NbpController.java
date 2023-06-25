package nbp.nbp.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import nbp.nbp.service.NbpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/nbp")
public class NbpController {
private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "500", description = "uh oh"),
            @ApiResponse(responseCode = "404", description = "kurza twarz")
    })
            @GetMapping(value = "/{startDate}/{endDate}")
            @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "upsi daisy - wiem, że i tak pokarze się BAD REQUEST")
 @Operation(description = "wybierz dwie daty między, którymi wyliczę średnią" )
    public ResponseEntity<Double>getnpb(@PathVariable String startDate, @PathVariable String endDate){

        return ResponseEntity.ok(nbpService.show(startDate,endDate));
    }
}