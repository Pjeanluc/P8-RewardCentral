package rewardCentral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rewardCentral.externeRewardCentralModule.ExterneRewardCentralModule;

import java.util.UUID;

@Service
public class RewardCentralServiceImpl implements RewardCentralService {

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

        return externeRewardCentralModule.getAttractionRewardPoints(attractionId,userId);
    }
}