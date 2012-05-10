package locale;

import java.util.ListResourceBundle;

public class lang_en extends ListResourceBundle {

	@Override
	public Object[][] getContents() {
		return contents;
	}

	private Object[][] contents = {
			{ "SAVE", "save" },
			{ "FARM", "farm" },
			{ "FARMER", "farmer" },
			{ "WELCOMEMSG", "Welcome to Farm Tycoon" },
			{ "newGame", "New game"},
			{ "loadGame", "Load game"},
			{ "LoadFailNoSave", "Failed to load game, no savegame found"},
			{ "moneystring", "€ %d"},
			{ "SAVEFOUND", "a previously saved game was found." },
			{ "ASKLOADGAME", "do you want to load this game? (yes/no)" },
			{ "yes", new String[] { "y", "yes" } },
			{ "no", new String[] { "n", "no" } },
			{ "POTATO" , "patato"},
			{ "CARROT", "carrot"},
			{ "WHEAT", "wheat"},		
			{ "CORN","corn"},		
			{ "GRAPE","grape"},		
			{ "LETTUCE","lettuce"},		
			{ "TOMATO","tomato"},		
			{ "STRAWBERRY","strawberry"},	
			{ "RASPBERRY","raspberry"},	
			{ "COCOA","cocoa"},		
			{ "SOY","soy"},
			{ "PLOW","plow field"},
			{ "BUILDBARN","build barn"},
			{ "COWS","cows"},
			{ "CHICKENS","chickens"},
			{ "None","empty field"},
			{ "Plowing","plowing"},
			{ "Plowed","plowed"},
			{ "Crop","crop"},
			{ "Building","building"},
			{ "Market","market"},
			{ "Crop_POTATO_GROWING","growing potatoes"},
			{ "Crop_CARROT_GROWING","growing carrots"},
			{ "Crop_WHEAT_GROWING","growing wheat"},
			{ "Crop_CORN_GROWING","growing corn"},
			{ "Crop_GRAPE_GROWING","growing grapes"},
			{ "Crop_LETTUCE_GROWING","growing lettuce"},
			{ "Crop_TOMATO_GROWING","growing tomatoes"},
			{ "Crop_STRAWBERRY_GROWING","growing strawberries"},
			{ "Crop_RASPBERRY_GROWING","growing raspberries"},
			{ "Crop_COCOA_GROWING","growing cacao"},
			{ "Crop_SOY_GROWING","growing soy"},
			{ "Crop_POTATO_READY","potatoes are ready"},
			{ "Crop_CARROT_READY","carrots are ready"},
			{ "Crop_WHEAT_READY","wheat is ready"},
			{ "Crop_CORN_READY","corn is ready"},
			{ "Crop_GRAPE_READY","grapes are ready"},
			{ "Crop_LETTUCE_READY","lettuce is ready"},
			{ "Crop_TOMATO_READY","tomatoes are ready"},
			{ "Crop_STRAWBERRY_READY","strawberries are ready"},
			{ "Crop_RASPBERRY_READY","raspberries are ready"},
			{ "Crop_COCOA_READY","cacao is ready"},
			{ "Crop_SOY_READY","soy is ready"},
			{ "MSG_CROP_ROTTEN","There are crops rot"},
			{ "Crop_POTATO_ROTTEN","potatoes are rotten"},
			{ "Crop_CARROT_ROTTEN","carrots are rotten"},
			{ "Crop_WHEAT_ROTTEN","wheat is rotten"},
			{ "Crop_CORN_ROTTEN","corn is rotten"},
			{ "Crop_GRAPE_ROTTEN","grapes are rotten"},
			{ "Crop_LETTUCE_ROTTEN","lettuce is rotten"},
			{ "Crop_TOMATO_ROTTEN","tomatoes rotten"},
			{ "Crop_STRAWBERRY_ROTTEN","strawberries are rotten"},
			{ "Crop_RASPBERRY_ROTTEN","raspberries are rotten"},
			{ "Crop_COCOA_ROTTEN","cocoabeans are rotten"},
			{ "Crop_SOY_ROTTEN","soy beans are rotten"},
			{ "Animal_Chicken_NORMAL", "chickens"},
			{ "Animal_Cow_NORMAL", "cows"},
			{ "Animal_Chicken_READY", "chickens laid eggs"},
			{ "Animal_Cow_READY", "cows are ready to give milk"},
			{ "MSG_ANIMAL-DEATH", "There are dead animals"},
			{ "Animal_Chicken_DEATH", "chickens are dead"},
			{ "Animal_Cow_DEATH", "cows are dead"},
			{ "HARVEST", "harvest"},
			{ "CLEAR", "clear"},
			{ "ANIMALS", "animals"},
			{ "Animal", "animal"},
			{ "Chicken", "chicken"},
			{ "Cow", "cow"},
			{ "EGGS", "eggs"},
			{ "MILK", "milk"},
			{ "COLLECT", "collect"},
			{ "ENTER", "enter"},
			{ "sellstring", "sell at: "},
			{ "daystring", "%d days"},
			{ "FACTORY", "factory"},
			{ "FACTORY_START", "the factory started"},
			{ "BUTTERFACTORY","butterfactory"},
			{ "CHEESEFACTORY","cheesefactory"},
			{ "FLOURFACTORY","flourfactory"},
			{ "JUICEFACTORY","juicefactory"},
			{ "SALADFACTORY","saladfactory"},
			{ "OILFACTORY","oilfactory"},
			{ "CHOCOLATEFACTORY","chocolatefactory"},
			{ "BREADFACTORY","Breadfactory"},
			{ "TRUFFLEFACTORY","trufflefactory"},
			{ "Barn", "barn"},		
			{ "BARNINUSE","the barn you would like to delete is in use."},
			{ "MSG_INFECTION", "the plague has occurred "},
			{ "MSG_STORM", "There's been a storm "},
			{ "MSG_NOCASH", "There's no money left"}
	};
}