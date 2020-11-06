package rewardCentral.externeRewardCentralModule;

import rewardCentral.RewardCentral;

import java.util.UUID;

public interface ExterneRewardCentralModule {
    public RewardCentral getRewardCentral();
    public int getAttractionRewardPoints(UUID attractionId, UUID userId);
}
