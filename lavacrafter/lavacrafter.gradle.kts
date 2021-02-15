package net.runelite.client.plugins.foodeater9;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("foodeater9")
public interface FoodEater9Config extends Config
{

	@ConfigItem(
		keyName = "foodToEat",
		name = "Food",
		description = "the exact name of the food to eat (not case sensitive)",
		position = 1
	)
	default String foodToEat()
	{
		return "lobster";
	}

	@ConfigItem(
		keyName = "minimumHealth",
		name = "Minimum Health",
		description = "The minimum health to eat at",
		position = 2
	)
	default int minimumHealth()
	{
		return 20;
	}
}
