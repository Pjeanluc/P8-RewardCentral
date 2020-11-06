package rewardCentral.controler;


import rewardCentral.controler.exeptions.UUIDException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rewardCentral.service.RewardCentralService;


import java.util.UUID;

@RestController
public class RewardCentralControler {
    private Logger logger = LoggerFactory.getLogger(RewardCentralControler.class);

    @Autowired
    private RewardCentralService rewardCentralService;

    /**
     * give attraction reward points
     * @param attractionId atraction id in UUID format
     * @param userId user id in UUID format
     * @return reward point for the attraction
     * @throws UUIDException if id are not UUID
     */
    @GetMapping(value = "AttractionRewardPoints")
    @ResponseStatus(HttpStatus.OK)
    public int getAttractionRewardPoints (@RequestParam String attractionId, @RequestParam String userId) throws UUIDException {
        try {
            //logger.debug("Start AttractionRewardPoints for attractionId : " + attractionId +" et userId : " +userId );
            UUID attractionIdUUID = UUID.fromString(attractionId);
            UUID userIdUUID = UUID.fromString(userId);
            return rewardCentralService.getAttractionRewardPoints(attractionIdUUID,userIdUUID);
        } catch (Exception e){
            throw new UUIDException("UUID input error: attractionId = "+ attractionId + "  userId = " + userId + "  message :" + e.getMessage());
        }

    }

}

