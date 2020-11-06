package rewardCentral.externeRewardCentralModule;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Configuration
public class ExterneRewardCentralModuleImpl implements  ExterneRewardCentralModule {
    private static RewardCentral rewardCentral = new RewardCentral();

    @Override
    public RewardCentral getRewardCentral(){
        //return new RewardCentral();
        return rewardCentral;
    }

    @Override
    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
        return rewardCentral.getAttractionRewardPoints(attractionId,userId);
    }

}