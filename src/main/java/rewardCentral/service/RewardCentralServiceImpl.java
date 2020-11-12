package rewardCentral.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rewardCentral.controler.RewardCentralControler;
import rewardCentral.externeRewardCentralModule.ExterneRewardCentralModule;

import java.util.UUID;

@Service
public class RewardCentralServiceImpl implements RewardCentralService {
    private Logger logger = LoggerFactory.getLogger(RewardCentralControler.class);

    @Autowired
    private ExterneRewardCentralModule externeRewardCentralModule;

    /**
     * give attraction reward points
     * @param attractionId attraction id in UUID format
     * @param userId user id in UUID format
     * @return reward points for attraction
     */
    @Override
    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
        logger.debug("getAttractionRewardPoints");

        return externeRewardCentralModule.getAttractionRewardPoints(attractionId,userId);
    }
}