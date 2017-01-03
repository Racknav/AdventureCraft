package com.adc.core.items;

import net.minecraft.item.Item;

public class ItemsRegistry {

	public static Item TEST_ITEM;
	
	/* Currency */
	public static Item GOLD_PIECE;
	public static Item GOLD_PURSE;
	
	/* Adventuring Gear **
	// Comfort and Shelter
	public static Item COLLAPSIBLE_BATHTUB;
	public static Item BEDROLL;
	public static Item BLANKET;
	public static Item FOLDING_CHAIR;
	public static Item COT;
	public static Item HAMMOCK;
	public static Item SOAP;
	public static Item TENT_SMALL;
	public static Item TENT_MEDIUM;
	public static Item TENT_LARGE;
	public static Item TENT_PAVILION;
	public static Item TENT_HANGING;
	// Hunting and Fishing
	public static Item FISHHOOK;
	public static Item NET_BELL;
	public static Item NET_BUTTERFLY;
	public static Item NETTING_CAMOUFLAGE;
	public static Item NET_FISHING;
	public static Item SCENT_CLOAK;
	public static Item TRAP_BEAR;
	// Misc. Outdoors Gear
	public static Item AIR_BLADDER;
	public static Item ANIMAL_GLUE;
	public static Item BELL;
	public static Item BOUY_COMMON;
	public static Item BOUY_SUPERIOR;
	public static Item COMPASS;
	public static Item HEATSTONE;
	public static Item MAP;
	public static Item MIRROR_SMALL_STEEL;
	public static Item ROPE_HEMP;
	public static Item ROPE_BLOODVINE;
	public static Item ROPE_SILK;
	public static Item ROPE_SPIDER_SILK;
	public static Item STAR_CHART;
	public static Item STRING;
	public static Item HORN_POWDER;
	public static Item HORN_SIGNAL;
	public static Item WISTLE_BEAST;
	public static Item WISTLE_SIGNAL;
	public static Item WISTLE_SILENT;
	// Illuminations
	public static Item CANDLE;
	public static Item CANDLE_HELMET;
	public static Item CANDLE_INSECTBANE;
	public static Item CANDLE_LAMP;
	public static Item CANDLESTICK;
	public static Item DARKFLARE;
	public static Item FIREWOOD;
	public static Item LAMP;
	public static Item LAMP_CELESTIAL;
	public static Item LANTERN_BULLSEYE;
	public static Item LANTERN_DARKLIGHT;
	public static Item LANTERN_HOODED;
	public static Item LANTERN_MINER;
	public static Item LANTERN_WATERPROOF;
	public static Item MOONROD;
	public static Item SUNROD;
	public static Item THURIBLE;
	public static Item TORCH;
	public static Item TORCH_EVERBURNING;
	// Food and Drink
	// Beverages (Alcoholic)
	public static Item ABSINTHE;
	public static Item ALE;
	public static Item ALE_DWARVEN_STOUT;
	public static Item ALE_LUGLURCH;
	public static Item APPLEJACK;
	public static Item BAIJU;
	public static Item BUFO;
	public static Item CAUIM;
	public static Item GODSBREW;
	public static Item GROG;
	public static Item KUMIS;
	public static Item MEAD;
	public static Item PULQUE;
	public static Item RUMBOOZLE;
	public static Item TEPACHE;
	public static Item WHISKEY_DRAGON_PUNCH;
	public static Item WHISKEY_OLDLAW;
	public static Item WINE_COMMON;
	public static Item WINE_FINE;
	public static Item WINE_SEALORD;
	// Beverages (Nonalcoholic)
	public static Item COFFEE_COMMON;
	public static Item COFFEE_EXOTIC;
	public static Item KAHVE;
	public static Item MILK;
	public static Item MILK_POWDERED;
	public static Item TEA;
	public static Item TONIC_MEDICINAL;
	// Foods
	public static Item BREAD;
	public static Item CAVIAR;
	public static Item CHEESE;
	public static Item CHOCOLATE;
	public static Item FORTUNE_COOKIE;
	public static Item HAGGIS;
	public static Item HONEY;
	public static Item ICE_CREAM;
	public static Item MAPLE_SYRUP;
	public static Item MEAL_POOR;
	public static Item MEAL_COMMON;
	public static Item MEAL_GOOD;
	public static Item MEAL_BANQUET;
	public static Item MEAT;
	public static Item MEAT_STREET;
	public static Item RATIONS_TRAIL;
	public static Item RATIONS_DWARVEN_TRAIL;
	public static Item RATIONS_ELVEN_TRAIL;
	public static Item RATIONS_GNOME_TRAIL;
	public static Item RATIONS_HALFLING_TRAIL;
	public static Item RATIONS_ORC_TRAIL;
	public static Item RATIONS_WANDERMEAL;
	public static Item TRAVEL_CAKE_MIX;
	public static Item YOGURT;
	*/
	
	public static void initItems() {
		TEST_ITEM = new ADCItem("test_item", 	"ItemTest");
		
		/* Currency */
		GOLD_PIECE 	= new ADCItem("gold_piece", "ItemGoldPiece");
		GOLD_PURSE  = new ADCItem("gold_purse", "ItemGoldPurse");
		

		/* Adventuring Gear **
		// Comfort and Shelter
		COLLAPSIBLE_BATHTUB = new ADCItem("collapsible_bathtub", 	"ItemCollapsibleBathtub");
		BEDROLL 			= new ADCItem("bedroll", 				"ItemBedroll");
		BLANKET 			= new ADCItem("blanket", 				"ItemBlanket");
		FOLDING_CHAIR 		= new ADCItem("folding_chair", 			"ItemFoldingChair");
		COT 				= new ADCItem("cot", 					"ItemCot");
		HAMMOCK 			= new ADCItem("hammock", 				"ItemHammock");
		SOAP 				= new ADCItem("soap", 					"ItemSoap");
		TENT_SMALL 			= new ADCItem("tent_small", 			"ItemTentSmall");
		TENT_MEDIUM 		= new ADCItem("tent_medium", 			"ItemTentMedium");
		TENT_LARGE 			= new ADCItem("tent_large", 			"ItemTentLarge");
		TENT_PAVILION 		= new ADCItem("tent_pavilion", 			"ItemTentPavilion");
		TENT_HANGING 		= new ADCItem("tent_hanging", 			"ItemTentHanging");

		// Hunting and Fishing
		FISHHOOK 			= new ADCItem("fishhook",			"ItemFishhook");
		NET_BELL 			= new ADCItem("net_bell",			"ItemNetBell");
		NET_BUTTERFLY 		= new ADCItem("net_butterfly",		"ItemNetButterfly");
		NETTING_CAMOUFLAGE 	= new ADCItem("netting_camouflage", "ItemNettingCamouflage");
		NET_FISHING 		= new ADCItem("net_fishing",		"ItemNetFishing");
		SCENT_CLOAK			= new ADCItem("scent_cloak",		"ItemScentCloak");
		TRAP_BEAR 			= new ADCItem("trap_bear",			"ItemTrapBear");
		
		// Misc. Outdoors Gear
		AIR_BLADDER 		= new ADCItem("air_bladder", 		"ItemAirBladder");
		ANIMAL_GLUE 		= new ADCItem("animal_glue", 		"ItemAnimalGlue");
		BELL 				= new ADCItem("bell", 				"ItemBell");
		BOUY_COMMON 		= new ADCItem("bouy_common", 		"ItemBouyCommon");
		BOUY_SUPERIOR 		= new ADCItem("bouy_superior", 		"ItemBouySuperior");
		COMPASS 			= new ADCItem("compass", 			"ItemCompass");
		HEATSTONE 			= new ADCItem("heatstone", 			"ItemHeatstone");
		MAP 				= new ADCItem("map", 				"ItemMap");
		MIRROR_SMALL_STEEL 	= new ADCItem("mirror_small_steel",	"ItemMirrorSmallSteel");
		ROPE_HEMP 			= new ADCItem("rope_hemp", 			"ItemRopeHemp");
		ROPE_BLOODVINE 		= new ADCItem("rope_bloodvine", 	"ItemRopeBloodvine");
		ROPE_SILK 			= new ADCItem("rope_silk", 			"ItemRopeSilk");
		ROPE_SPIDER_SILK 	= new ADCItem("rope_spider_silk", 	"ItemRopeSpiderSilk");
		STAR_CHART 			= new ADCItem("star_chart", 		"ItemStarChart");
		STRING 				= new ADCItem("string", 			"ItemString");
		HORN_POWDER 		= new ADCItem("horn_powder", 		"ItemHornPowder");
		HORN_SIGNAL 		= new ADCItem("horn_signal", 		"ItemHornSignal");
		WISTLE_BEAST 		= new ADCItem("wistle_beast",	 	"ItemWistleBeast");
		WISTLE_SIGNAL 		= new ADCItem("wistle_signal", 		"ItemWistleSignal");
		WISTLE_SILENT 		= new ADCItem("wistle_silent", 		"ItemWistleSilent");
		
		// Illuminations
		CANDLE 				= new ADCItem("candle", 			"ItemCandle");
		CANDLE_HELMET 		= new ADCItem("candle_helmet", 		"ItemCandleHelmet");
		CANDLE_INSECTBANE 	= new ADCItem("candle_insectbane", 	"ItemCandleInsectbane");
		CANDLE_LAMP 		= new ADCItem("candle_lamp", 		"ItemCandleLamp");
		CANDLESTICK 		= new ADCItem("candlestick", 		"ItemCandlestick");
		DARKFLARE 			= new ADCItem("darkflare", 			"ItemDarkflare");
		FIREWOOD 			= new ADCItem("firewood", 			"ItemFirewood");
		LAMP 				= new ADCItem("lamp", 				"ItemLamp");
		LAMP_CELESTIAL 		= new ADCItem("lamp_celestial", 	"ItemLampCelestial");
		LANTERN_BULLSEYE 	= new ADCItem("lantern_bullseye", 	"ItemLanternBullseye");
		LANTERN_DARKLIGHT 	= new ADCItem("lantern_darklight", 	"ItemLanternDarklight");
		LANTERN_HOODED 		= new ADCItem("lantern_hooded", 	"ItemLanternHooded");
		LANTERN_MINER 		= new ADCItem("lantern_miner", 		"ItemLanternMiner");
		LANTERN_WATERPROOF	= new ADCItem("lantern_waterproof",	"ItemLanternWaterproof");
		MOONROD 			= new ADCItem("moonrod", 			"ItemMoonrod");
		SUNROD 				= new ADCItem("sunrod", 			"ItemSunrod");
		THURIBLE 			= new ADCItem("thurible", 			"ItemThurible");
		TORCH 				= new ADCItem("torch",	 			"ItemTorch");
		TORCH_EVERBURNING 	= new ADCItem("torch_everburning", 	"ItemTorchEverburning");
		
		// TODO Model JSON files for the following items
		// Food and Drink
		// Beverages (Alcoholic)
		ABSINTHE 				= new ADCItem("absinthe", 				"ItemAbsinthe");
		ALE 					= new ADCItem("ale", 					"ItemAle");
		ALE_DWARVEN_STOUT 		= new ADCItem("ale_dwarven_stout", 		"ItemAleDwarvenStout");
		ALE_LUGLURCH 			= new ADCItem("ale_luglurch", 			"ItemAleLuglurch");
		APPLEJACK 				= new ADCItem("applejack", 				"ItemApplejack");
		BAIJU 					= new ADCItem("baiju", 					"ItemBaiju");
		BUFO 					= new ADCItem("bufo", 					"ItemBufo");
		CAUIM 					= new ADCItem("cauim", 					"ItemCauim");
		GODSBREW 				= new ADCItem("godsbrew", 				"ItemGodsbrew");
		GROG 					= new ADCItem("grog", 					"ItemGrog");
		KUMIS 					= new ADCItem("kumis", 					"ItemKumis");
		MEAD 					= new ADCItem("mead", 					"ItemMead");
		PULQUE 					= new ADCItem("pulque", 				"ItemPulque");
		RUMBOOZLE 				= new ADCItem("rumboozle", 				"ItemRumboozle");
		TEPACHE 				= new ADCItem("tepache", 				"ItemTepache");
		WHISKEY_DRAGON_PUNCH 	= new ADCItem("whiskey_dragon_punch",	"ItemWhiskeyDragonPunch");
		WHISKEY_OLDLAW 			= new ADCItem("whiskey_oldlaw", 		"ItemWhiskeyOldlaw");
		WINE_COMMON 			= new ADCItem("wine_common", 			"ItemWineCommon");
		WINE_FINE 				= new ADCItem("wine_fine", 				"ItemWineFine");
		WINE_SEALORD 			= new ADCItem("wine_sealord", 			"ItemWineSealord");
		// Beverages (Nonalcoholic)
		COFFEE_COMMON 	= new ADCItem("coffee_common", 		"ItemCoffeeCommon");
		COFFEE_EXOTIC 	= new ADCItem("coffee_exotic", 		"ItemCoffeeExotic");
		KAHVE 			= new ADCItem("kahve", 				"ItemKahve");
		MILK 			= new ADCItem("milk", 				"ItemMilk");
		MILK_POWDERED 	= new ADCItem("milk_powdered",		"ItemMilkPowdered");
		TEA 			= new ADCItem("tea", 				"ItemTea");
		TONIC_MEDICINAL	= new ADCItem("tonic_medicinal",	"ItemTonicMedicinal");
		// Foods
		BREAD 					= new ADCItem("bread", 					"ItemBread");
		CAVIAR 					= new ADCItem("caviar", 				"ItemCaviar");
		CHEESE 					= new ADCItem("cheese", 				"ItemCheese");
		CHOCOLATE 				= new ADCItem("chocolate", 				"ItemChocolate");
		FORTUNE_COOKIE 			= new ADCItem("fortune_cookie", 		"ItemFortuneCookie");
		HAGGIS 					= new ADCItem("haggis", 				"ItemHaggis");
		HONEY 					= new ADCItem("honey", 					"ItemHoney");
		ICE_CREAM 				= new ADCItem("ice_cream", 				"ItemIceCream");
		MAPLE_SYRUP 			= new ADCItem("maple_syrup", 			"ItemMapleSyrup");
		MEAL_POOR 				= new ADCItem("meal_poor", 				"ItemMealPoor");
		MEAL_COMMON 			= new ADCItem("meal_common", 			"ItemMealCommon");
		MEAL_GOOD 				= new ADCItem("meal_good", 				"ItemMealGood");
		MEAL_BANQUET 			= new ADCItem("meal_banquet", 			"ItemMealBanquet");
		MEAT 					= new ADCItem("meat", 					"ItemMeat");
		MEAT_STREET 			= new ADCItem("meat_street", 			"ItemMeatStreet");
		RATIONS_TRAIL 			= new ADCItem("rations_trail", 			"ItemRationsTrail");
		RATIONS_DWARVEN_TRAIL	= new ADCItem("rations_dwarven_trail", 	"ItemRationsDwarvenTrail");
		RATIONS_ELVEN_TRAIL 	= new ADCItem("rations_elven_trail", 	"ItemRationsElvenTrail");
		RATIONS_GNOME_TRAIL 	= new ADCItem("rations_gnome_trail",	"ItemRationsGnomeTrail");
		RATIONS_HALFLING_TRAIL 	= new ADCItem("rations_halfling_trail",	"ItemRationsHalflingTrail");
		RATIONS_ORC_TRAIL 		= new ADCItem("rations_orc_trail", 		"ItemRationsOrcTrail");
		RATIONS_WANDERMEAL 		= new ADCItem("rations_wandermeal", 	"ItemRationsWandermeal");
		TRAVEL_CAKE_MIX 		= new ADCItem("travel_cake_mix", 		"ItemTravelCakeMix");
		YOGURT 					= new ADCItem("yogurt", 				"ItemYogurt");
		
		 */
	}
	

	public static void registerRenders() {
		ItemsManager.registerRender(TEST_ITEM);
		
		/* Currency */
		ItemsManager.registerRender(GOLD_PIECE);
		ItemsManager.registerRender(GOLD_PURSE);
		
		/* Adventuring Gear **
		// Comfort and Shelter
		ItemsManager.registerRender(COLLAPSIBLE_BATHTUB);
		ItemsManager.registerRender(BEDROLL);
		ItemsManager.registerRender(BLANKET);
		ItemsManager.registerRender(FOLDING_CHAIR);
		ItemsManager.registerRender(COT);
		ItemsManager.registerRender(HAMMOCK);
		ItemsManager.registerRender(SOAP);
		ItemsManager.registerRender(TENT_SMALL);
		ItemsManager.registerRender(TENT_MEDIUM);
		ItemsManager.registerRender(TENT_LARGE);
		ItemsManager.registerRender(TENT_PAVILION);
		ItemsManager.registerRender(TENT_HANGING);
		// Hunting and Fishing
		ItemsManager.registerRender(FISHHOOK);
		ItemsManager.registerRender(NET_BELL);
		ItemsManager.registerRender(NET_BUTTERFLY);
		ItemsManager.registerRender(NETTING_CAMOUFLAGE);
		ItemsManager.registerRender(NET_FISHING);
		ItemsManager.registerRender(SCENT_CLOAK);
		ItemsManager.registerRender(TRAP_BEAR);
		// Misc. Outdoors Gear
		ItemsManager.registerRender(AIR_BLADDER);
		ItemsManager.registerRender(ANIMAL_GLUE);
		ItemsManager.registerRender(BELL);
		ItemsManager.registerRender(BOUY_COMMON);
		ItemsManager.registerRender(BOUY_SUPERIOR);
		ItemsManager.registerRender(COMPASS);
		ItemsManager.registerRender(HEATSTONE);
		ItemsManager.registerRender(MAP);
		ItemsManager.registerRender(MIRROR_SMALL_STEEL);
		ItemsManager.registerRender(ROPE_HEMP);
		ItemsManager.registerRender(ROPE_BLOODVINE);
		ItemsManager.registerRender(ROPE_SILK);
		ItemsManager.registerRender(ROPE_SPIDER_SILK);
		ItemsManager.registerRender(STAR_CHART);
		ItemsManager.registerRender(STRING);
		ItemsManager.registerRender(HORN_POWDER);
		ItemsManager.registerRender(HORN_SIGNAL);
		ItemsManager.registerRender(WISTLE_BEAST);
		ItemsManager.registerRender(WISTLE_SIGNAL);
		ItemsManager.registerRender(WISTLE_SILENT);
		// Illuminations
		ItemsManager.registerRender(CANDLE);
		ItemsManager.registerRender(CANDLE_HELMET);
		ItemsManager.registerRender(CANDLE_INSECTBANE);
		ItemsManager.registerRender(CANDLE_LAMP);
		ItemsManager.registerRender(CANDLESTICK);
		ItemsManager.registerRender(DARKFLARE);
		ItemsManager.registerRender(FIREWOOD);
		ItemsManager.registerRender(LAMP);
		ItemsManager.registerRender(LAMP_CELESTIAL);
		ItemsManager.registerRender(LANTERN_BULLSEYE);
		ItemsManager.registerRender(LANTERN_DARKLIGHT);
		ItemsManager.registerRender(LANTERN_HOODED);
		ItemsManager.registerRender(LANTERN_MINER);
		ItemsManager.registerRender(LANTERN_WATERPROOF);
		ItemsManager.registerRender(MOONROD);
		ItemsManager.registerRender(SUNROD);
		ItemsManager.registerRender(THURIBLE);
		ItemsManager.registerRender(TORCH);
		ItemsManager.registerRender(TORCH_EVERBURNING);
		// Food and Drink
		// Beverages (Alcoholic)
		ItemsManager.registerRender(ABSINTHE);
		ItemsManager.registerRender(ALE);
		ItemsManager.registerRender(ALE_DWARVEN_STOUT);
		ItemsManager.registerRender(ALE_LUGLURCH);
		ItemsManager.registerRender(APPLEJACK);
		ItemsManager.registerRender(BAIJU);
		ItemsManager.registerRender(BUFO);
		ItemsManager.registerRender(CAUIM);
		ItemsManager.registerRender(GODSBREW);
		ItemsManager.registerRender(GROG);
		ItemsManager.registerRender(KUMIS);
		ItemsManager.registerRender(MEAD);
		ItemsManager.registerRender(PULQUE);
		ItemsManager.registerRender(RUMBOOZLE);
		ItemsManager.registerRender(TEPACHE);
		ItemsManager.registerRender(WHISKEY_DRAGON_PUNCH);
		ItemsManager.registerRender(WHISKEY_OLDLAW);
		ItemsManager.registerRender(WINE_COMMON);
		ItemsManager.registerRender(WINE_FINE);
		ItemsManager.registerRender(WINE_SEALORD);
		// Beverages (Nonalcoholic)
		ItemsManager.registerRender(COFFEE_COMMON);
		ItemsManager.registerRender(COFFEE_EXOTIC);
		ItemsManager.registerRender(KAHVE);
		ItemsManager.registerRender(MILK);
		ItemsManager.registerRender(MILK_POWDERED);
		ItemsManager.registerRender(TEA);
		ItemsManager.registerRender(TONIC_MEDICINAL);
		// Foods
		ItemsManager.registerRender(BREAD);
		ItemsManager.registerRender(CAVIAR);
		ItemsManager.registerRender(CHEESE);
		ItemsManager.registerRender(CHOCOLATE);
		ItemsManager.registerRender(FORTUNE_COOKIE);
		ItemsManager.registerRender(HAGGIS);
		ItemsManager.registerRender(HONEY);
		ItemsManager.registerRender(ICE_CREAM);
		ItemsManager.registerRender(MAPLE_SYRUP);
		ItemsManager.registerRender(MEAL_POOR);
		ItemsManager.registerRender(MEAL_COMMON);
		ItemsManager.registerRender(MEAL_GOOD);
		ItemsManager.registerRender(MEAL_BANQUET);
		ItemsManager.registerRender(MEAT);
		ItemsManager.registerRender(MEAT_STREET);
		ItemsManager.registerRender(RATIONS_TRAIL);
		ItemsManager.registerRender(RATIONS_DWARVEN_TRAIL);
		ItemsManager.registerRender(RATIONS_ELVEN_TRAIL);
		ItemsManager.registerRender(RATIONS_GNOME_TRAIL);
		ItemsManager.registerRender(RATIONS_HALFLING_TRAIL);
		ItemsManager.registerRender(RATIONS_ORC_TRAIL);
		ItemsManager.registerRender(RATIONS_WANDERMEAL);
		ItemsManager.registerRender(TRAVEL_CAKE_MIX);
		ItemsManager.registerRender(YOGURT);
		*/
	}
	
	
}
