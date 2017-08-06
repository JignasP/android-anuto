package ch.logixisland.anuto.entity.enemy;

import ch.logixisland.anuto.data.enemy.EnemyGlobalSettings;
import ch.logixisland.anuto.data.enemy.HealerSettings;

public class HealerProperties extends EnemyProperties {

    private final HealerSettings mHealerSettings;

    public HealerProperties(
            HealerSettings healerSettings,
            EnemyGlobalSettings globalSettings,
            float healthModifier,
            float rewardModifier) {
        super(healerSettings, globalSettings, healthModifier, rewardModifier);
        mHealerSettings = healerSettings;
    }

    public float getHealAmount() {
        return mHealerSettings.getHealAmount();
    }

    public float getHealRadius() {
        return mHealerSettings.getHealRadius();
    }

    public float getHealInterval() {
        return mHealerSettings.getHealInterval();
    }

    public float getHealDuration() {
        return mHealerSettings.getHealDuration();
    }
}