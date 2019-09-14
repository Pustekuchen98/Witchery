package com.emoniph.witchery;

import com.emoniph.witchery.Witchery;
import com.emoniph.witchery.WitcheryFluids;
import com.emoniph.witchery.brewing.ItemBrew;
import com.emoniph.witchery.brewing.ItemBrewBucket;
import com.emoniph.witchery.common.ExtendedPlayer;
import com.emoniph.witchery.item.ItemArthana;
import com.emoniph.witchery.item.ItemBiomeNote;
import com.emoniph.witchery.item.ItemBoline;
import com.emoniph.witchery.item.ItemBook;
import com.emoniph.witchery.item.ItemBrewBag;
import com.emoniph.witchery.item.ItemBrewEndlessWater;
import com.emoniph.witchery.item.ItemBrewFuel;
import com.emoniph.witchery.item.ItemBucketSpirit;
import com.emoniph.witchery.item.ItemCaneSword;
import com.emoniph.witchery.item.ItemChalk;
import com.emoniph.witchery.item.ItemCircleTalisman;
import com.emoniph.witchery.item.ItemCoffin;
import com.emoniph.witchery.item.ItemDeathsClothes;
import com.emoniph.witchery.item.ItemDeathsHand;
import com.emoniph.witchery.item.ItemDiviner;
import com.emoniph.witchery.item.ItemDuplicationStaff;
import com.emoniph.witchery.item.ItemEarmuffs;
import com.emoniph.witchery.item.ItemEntityLocator;
import com.emoniph.witchery.item.ItemGeneral;
import com.emoniph.witchery.item.ItemGlassGoblet;
import com.emoniph.witchery.item.ItemGoblinClothes;
import com.emoniph.witchery.item.ItemHandBow;
import com.emoniph.witchery.item.ItemHornOfTheHunt;
import com.emoniph.witchery.item.ItemHunterClothes;
import com.emoniph.witchery.item.ItemHuntsmanSpear;
import com.emoniph.witchery.item.ItemKobolditePickaxe;
import com.emoniph.witchery.item.ItemLeonardsUrn;
import com.emoniph.witchery.item.ItemMarkupBook;
import com.emoniph.witchery.item.ItemMirror;
import com.emoniph.witchery.item.ItemMoonCharm;
import com.emoniph.witchery.item.ItemMutator;
import com.emoniph.witchery.item.ItemMysticBranch;
import com.emoniph.witchery.item.ItemParasyticLouse;
import com.emoniph.witchery.item.ItemPolynesiaCharm;
import com.emoniph.witchery.item.ItemPoppet;
import com.emoniph.witchery.item.ItemPoppetShelfCompass;
import com.emoniph.witchery.item.ItemSilverSword;
import com.emoniph.witchery.item.ItemSpectralStone;
import com.emoniph.witchery.item.ItemStew;
import com.emoniph.witchery.item.ItemSunGrenade;
import com.emoniph.witchery.item.ItemTaglockKit;
import com.emoniph.witchery.item.ItemVampireClothes;
import com.emoniph.witchery.item.ItemVanillaPotion;
import com.emoniph.witchery.item.ItemWitchHand;
import com.emoniph.witchery.item.ItemWitchSeeds;
import com.emoniph.witchery.item.ItemWitchSlab;
import com.emoniph.witchery.item.ItemWitchesClothes;
import com.emoniph.witchery.item.ItemWolfToken;
import net.minecraft.block.BlockSlab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class WitcheryItems {

   public final ItemGeneral GENERIC = (ItemGeneral)(new ItemGeneral()).setUnlocalizedName("witchery:ingredient").setTextureName("witchery:ingredient");
   public final ItemTaglockKit TAGLOCK_KIT = (ItemTaglockKit)(new ItemTaglockKit()).setUnlocalizedName("witchery:taglockkit").setTextureName("witchery:taglockKit");
   public final ItemPoppet POPPET = (ItemPoppet)(new ItemPoppet()).setUnlocalizedName("witchery:poppet").setTextureName("witchery:poppet");
   public final ItemVanillaPotion POTIONS = (ItemVanillaPotion)(new ItemVanillaPotion()).setUnlocalizedName("witchery:potion").setTextureName("potion");
   public final Item SLAB_SINGLE;
   public final Item SLAB_DOUBLE;
   public final Item PERPERTUAL_ICE_SLAB_SINGLE;
   public final Item PERPERTUAL_ICE_SLAB_DOUBLE;
   public final Item SNOW_SLAB_SINGLE;
   public final Item SNOW_SLAB_DOUBLE;
   public final Item COFFIN;
   public final Item STEW;
   public final Item STEW_RAW;
   public final Item MIRROR;
   public final Item CHALK_RITUAL;
   public final Item CHALK_OTHERWHERE;
   public final Item CHALK_INFERNAL;
   public final Item CHALK_GOLDEN;
   public final Item BOLINE;
   public final Item ARTHANA;
   public final Item HUNTSMANS_SPEAR;
   public final Item CROSSBOW_PISTOL;
   public final ItemDeathsHand DEATH_HAND;
   public final Item SILVER_SWORD;
   public final ItemCaneSword CANE_SWORD;
   public final Item WITCH_HAND;
   public final Item CIRCLE_TALISMAN;
   public final Item MYSTIC_BRANCH;
   public final Item DIVINER_WATER;
   public final Item DIVINER_LAVA;
   public final Item POLYNESIA_CHARM;
   public final Item DEVILS_TONGUE_CHARM;
   public final Item MUTATING_SPRIG;
   public final Item PARASYTIC_LOUSE;
   public final Item BREW_BAG;
   public final Item SPECTRAL_STONE;
   public final Item SHELF_COMPASS;
   public final Item KOBOLDITE_PICKAXE;
   public final Item DUP_STAFF;
   public final Item BREW;
   public final Item BREW_FUEL;
   public final Item BREW_ENDLESS_WATER;
   public final Item BIOME_BOOK;
   public final Item BIOME_NOTE;
   public final Item CAULDRON_BOOK;
   public final Item LEONARDS_URN;
   public final Item PLAYER_COMPASS;
   public final Item MOON_CHARM;
   public final Item HORN_OF_THE_HUNT;
   public final Item CREATIVE_WOLF_TOKEN;
   public final ItemGlassGoblet BLOOD_GOBLET;
   public final Item SUN_GRENADE;
   public final Item VAMPIRE_BOOK;
   public final Item DUP_GRENADE;
   public final ItemWitchesClothes WITCH_HAT;
   public final ItemWitchesClothes BABAS_HAT;
   public final ItemWitchesClothes WITCH_ROBES;
   public final ItemWitchesClothes NECROMANCERS_ROBES;
   public final ItemWitchesClothes BITING_BELT;
   public final ItemWitchesClothes BARK_BELT;
   public final ItemWitchesClothes ICY_SLIPPERS;
   public final ItemWitchesClothes RUBY_SLIPPERS;
   public final ItemWitchesClothes SEEPING_SHOES;
   public final ItemHunterClothes HUNTER_HAT;
   public final ItemHunterClothes HUNTER_COAT;
   public final ItemHunterClothes HUNTER_LEGS;
   public final ItemHunterClothes HUNTER_BOOTS;
   public final ItemHunterClothes HUNTER_HAT_SILVERED;
   public final ItemHunterClothes HUNTER_COAT_SILVERED;
   public final ItemHunterClothes HUNTER_LEGS_SILVERED;
   public final ItemHunterClothes HUNTER_BOOTS_SILVERED;
   public final ItemHunterClothes HUNTER_HAT_GARLICKED;
   public final ItemHunterClothes HUNTER_COAT_GARLICKED;
   public final ItemHunterClothes HUNTER_LEGS_GARLICKED;
   public final ItemHunterClothes HUNTER_BOOTS_GARLICKED;
   public final ItemDeathsClothes DEATH_HOOD;
   public final ItemDeathsClothes DEATH_ROBE;
   public final ItemDeathsClothes DEATH_FEET;
   public final Item MOGS_QUIVER;
   public final Item GULGS_GURDLE;
   public final Item KOBOLDITE_HELM;
   public final Item EARMUFFS;
   public final ItemVampireClothes VAMPIRE_HAT;
   public final ItemVampireClothes VAMPIRE_HELMET;
   public final ItemVampireClothes VAMPIRE_COAT;
   public final ItemVampireClothes VAMPIRE_COAT_FEMALE;
   public final ItemVampireClothes VAMPIRE_COAT_CHAIN;
   public final ItemVampireClothes VAMPIRE_COAT_FEMALE_CHAIN;
   public final ItemVampireClothes VAMPIRE_LEGS;
   public final ItemVampireClothes VAMPIRE_LEGS_KILT;
   public final ItemVampireClothes VAMPIRE_BOOTS;
   public final Item SEEDS_BELLADONNA;
   public final Item SEEDS_MANDRAKE;
   public final Item SEEDS_ARTICHOKE;
   public final Item SEEDS_SNOWBELL;
   public final Item SEEDS_WORMWOOD;
   public final Item SEEDS_MINDRAKE;
   public final Item SEEDS_WOLFSBANE;
   public final Item SEEDS_GARLIC;
   public final Item BUCKET_FLOWINGSPIRIT;
   public final Item BUCKET_HOLLOWTEARS;
   public final Item BUCKET_BREW;


   public WitcheryItems() {
      this.SLAB_SINGLE = (new ItemWitchSlab((BlockSlab)Witchery.Blocks.WOOD_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.WOOD_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.WOOD_SLAB_DOUBLE)).setUnlocalizedName("witchery:witchwoodslab");
      this.SLAB_DOUBLE = (new ItemWitchSlab((BlockSlab)Witchery.Blocks.WOOD_SLAB_DOUBLE, (BlockSlab)Witchery.Blocks.WOOD_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.WOOD_SLAB_DOUBLE)).setUnlocalizedName("witchery:witchwooddoubleslab");
      this.PERPERTUAL_ICE_SLAB_SINGLE = (new ItemWitchSlab((BlockSlab)Witchery.Blocks.PERPETUAL_ICE_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.PERPETUAL_ICE_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.PERPETUAL_ICE_SLAB_DOUBLE)).setUnlocalizedName("witchery:iceslab");
      this.PERPERTUAL_ICE_SLAB_DOUBLE = (new ItemWitchSlab((BlockSlab)Witchery.Blocks.PERPETUAL_ICE_SLAB_DOUBLE, (BlockSlab)Witchery.Blocks.PERPETUAL_ICE_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.PERPETUAL_ICE_SLAB_DOUBLE)).setUnlocalizedName("witchery:icedoubleslab");
      this.SNOW_SLAB_SINGLE = (new ItemWitchSlab((BlockSlab)Witchery.Blocks.SNOW_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.SNOW_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.SNOW_SLAB_DOUBLE)).setUnlocalizedName("witchery:snowslab");
      this.SNOW_SLAB_DOUBLE = (new ItemWitchSlab((BlockSlab)Witchery.Blocks.SNOW_SLAB_DOUBLE, (BlockSlab)Witchery.Blocks.SNOW_SLAB_SINGLE, (BlockSlab)Witchery.Blocks.SNOW_SLAB_DOUBLE)).setUnlocalizedName("witchery:snowdoubleslab");
      this.COFFIN = (new ItemCoffin()).setUnlocalizedName("witchery:coffin").setTextureName("witchery:coffin");
      this.STEW = (new ItemStew(12, 1.0F)).setUnlocalizedName("witchery:stew").setTextureName("witchery:stew");
      this.STEW_RAW = (new ItemStew(1, 0.1F)).setUnlocalizedName("witchery:stewraw").setTextureName("witchery:stewraw");
      this.MIRROR = (new ItemMirror()).setUnlocalizedName("witchery:mirror").setTextureName("witchery:mirror");
      this.CHALK_RITUAL = (new ItemChalk(Witchery.Blocks.GLYPH_RITUAL)).setUnlocalizedName("witchery:chalkritual").setTextureName("witchery:chalkRitual");
      this.CHALK_OTHERWHERE = (new ItemChalk(Witchery.Blocks.GLYPH_OTHERWHERE)).setUnlocalizedName("witchery:chalkotherwhere").setTextureName("witchery:chalkOtherwhere");
      this.CHALK_INFERNAL = (new ItemChalk(Witchery.Blocks.GLYPH_INFERNAL)).setUnlocalizedName("witchery:chalkinfernal").setTextureName("witchery:chalkInfernal");
      this.CHALK_GOLDEN = (new ItemChalk(Witchery.Blocks.CIRCLE)).setUnlocalizedName("witchery:chalkheart").setTextureName("witchery:chalkHeart");
      this.BOLINE = (new ItemBoline()).setUnlocalizedName("witchery:boline").setTextureName("witchery:boline");
      this.ARTHANA = (new ItemArthana()).setUnlocalizedName("witchery:arthana").setTextureName("witchery:arthana");
      this.HUNTSMANS_SPEAR = (new ItemHuntsmanSpear()).setUnlocalizedName("witchery:huntsmanspear").setTextureName("witchery:huntsmanspear");
      this.CROSSBOW_PISTOL = (new ItemHandBow()).setUnlocalizedName("witchery:handbow").setTextureName("witchery:handbow");
      this.DEATH_HAND = (ItemDeathsHand)(new ItemDeathsHand()).setUnlocalizedName("witchery:deathshand").setTextureName("witchery:deathshand");
      this.SILVER_SWORD = (new ItemSilverSword()).setUnlocalizedName("witchery:silversword").setTextureName("witchery:silversword");
      this.CANE_SWORD = (ItemCaneSword)(new ItemCaneSword()).setUnlocalizedName("witchery:canesword").setTextureName("witchery:canesword");
      this.WITCH_HAND = (new ItemWitchHand()).setUnlocalizedName("witchery:witchhand").setTextureName("witchery:witchHand");
      this.CIRCLE_TALISMAN = (new ItemCircleTalisman()).setUnlocalizedName("witchery:circletalisman").setTextureName("witchery:circleTalisman");
      this.MYSTIC_BRANCH = (new ItemMysticBranch()).setUnlocalizedName("witchery:mysticbranch").setTextureName("witchery:mysticbranch");
      this.DIVINER_WATER = (new ItemDiviner(Blocks.water)).setUnlocalizedName("witchery:divinerwater").setTextureName("witchery:divinerWater");
      this.DIVINER_LAVA = (new ItemDiviner(Blocks.lava)).setUnlocalizedName("witchery:divinerlava").setTextureName("witchery:divinerLava");
      this.POLYNESIA_CHARM = (new ItemPolynesiaCharm(false)).setUnlocalizedName("witchery:polynesiacharm").setTextureName("witchery:polynesiaCharm");
      this.DEVILS_TONGUE_CHARM = (new ItemPolynesiaCharm(true)).setUnlocalizedName("witchery:devilstonguecharm").setTextureName("witchery:devilsTongueCharm");
      this.MUTATING_SPRIG = (new ItemMutator()).setUnlocalizedName("witchery:mutator").setTextureName("witchery:mutator");
      this.PARASYTIC_LOUSE = (new ItemParasyticLouse()).setUnlocalizedName("witchery:louse").setTextureName("witchery:louse");
      this.BREW_BAG = (new ItemBrewBag()).setUnlocalizedName("witchery:brewbag").setTextureName("witchery:brewbag");
      this.SPECTRAL_STONE = (new ItemSpectralStone()).setUnlocalizedName("witchery:spectralstone").setTextureName("witchery:witchery.spectralstone");
      this.SHELF_COMPASS = (new ItemPoppetShelfCompass()).setUnlocalizedName("witchery:shelfcompass").setTextureName("witchery:shelfcompass");
      this.KOBOLDITE_PICKAXE = (new ItemKobolditePickaxe()).setUnlocalizedName("witchery:kobolditepickaxe").setTextureName("witchery:kobolditepickaxe");
      this.DUP_STAFF = (new ItemDuplicationStaff()).setUnlocalizedName("witchery:dupstaff").setTextureName("witchery:dupstaff");
      this.BREW = (new ItemBrew()).setUnlocalizedName("witchery:brewbottle").setTextureName("witchery:brew_drinkable");
      this.BREW_FUEL = (new ItemBrewFuel()).setUnlocalizedName("witchery:brew.fuel").setTextureName("witchery:brew_drinkable");
      this.BREW_ENDLESS_WATER = (new ItemBrewEndlessWater()).setUnlocalizedName("witchery:brew.water").setTextureName("witchery:brew_drinkable");
      this.BIOME_BOOK = (new ItemBook()).setUnlocalizedName("witchery:bookbiomes2").setTextureName("witchery:biomebook2");
      this.BIOME_NOTE = (new ItemBiomeNote()).setUnlocalizedName("witchery:biomenote").setTextureName("witchery:biomenote");
      this.CAULDRON_BOOK = (new ItemMarkupBook(7)).setUnlocalizedName("witchery:cauldronbook").setTextureName("witchery:bookcauldron");
      this.LEONARDS_URN = (new ItemLeonardsUrn()).setUnlocalizedName("witchery:leonardsurn").setTextureName("witchery:leonardsurn");
      this.PLAYER_COMPASS = (new ItemEntityLocator()).setUnlocalizedName("witchery:playercompass").setTextureName("witchery:playercompass");
      this.MOON_CHARM = (new ItemMoonCharm()).setUnlocalizedName("witchery:mooncharm").setTextureName("witchery:mooncharm");
      this.HORN_OF_THE_HUNT = (new ItemHornOfTheHunt()).setUnlocalizedName("witchery:hornofthehunt").setTextureName("witchery:hornofthehunt");
      this.CREATIVE_WOLF_TOKEN = (new ItemWolfToken()).setUnlocalizedName("witchery:wolftoken").setTextureName("witchery:wolftoken");
      this.BLOOD_GOBLET = (ItemGlassGoblet)(new ItemGlassGoblet()).setUnlocalizedName("witchery:glassgoblet").setTextureName("witchery:glassgoblet");
      this.SUN_GRENADE = (new ItemSunGrenade(0)).setUnlocalizedName("witchery:sungrenade").setTextureName("witchery:sungrenade");
      this.VAMPIRE_BOOK = (new ItemMarkupBook(7, new int[]{0, 9}) {
         @Override
         public void onBookRead(ItemStack stack, World world, EntityPlayer player) {
            ExtendedPlayer.get(player).increaseVampireLevelCap(stack.getItemDamage() + 1);
         }
      }).setUnlocalizedName("witchery:vampirebook").setTextureName("witchery:vbook");
      this.DUP_GRENADE = (new ItemSunGrenade(1)).setUnlocalizedName("witchery:dupgrenade").setTextureName("witchery:dupgrenade");
      this.WITCH_HAT = (ItemWitchesClothes)(new ItemWitchesClothes(0)).setUnlocalizedName("witchery:witchhat").setTextureName("witchery:witchesHat");
      this.BABAS_HAT = (ItemWitchesClothes)(new ItemWitchesClothes(0)).setUnlocalizedName("witchery:babashat").setTextureName("witchery:babasHat");
      this.WITCH_ROBES = (ItemWitchesClothes)(new ItemWitchesClothes(1)).setUnlocalizedName("witchery:witchrobe").setTextureName("witchery:witchesRobes");
      this.NECROMANCERS_ROBES = (ItemWitchesClothes)(new ItemWitchesClothes(1)).setUnlocalizedName("witchery:necromancerrobe").setTextureName("witchery:necromancerRobes");
      this.BITING_BELT = (ItemWitchesClothes)(new ItemWitchesClothes(2)).setUnlocalizedName("witchery:bitingbelt").setTextureName("witchery:bitingBelt");
      this.BARK_BELT = (ItemWitchesClothes)(new ItemWitchesClothes(2)).setUnlocalizedName("witchery:barkbelt").setTextureName("witchery:barkBelt");
      this.ICY_SLIPPERS = (ItemWitchesClothes)(new ItemWitchesClothes(3)).setUnlocalizedName("witchery:iceslippers").setTextureName("witchery:iceSlippers");
      this.RUBY_SLIPPERS = (ItemWitchesClothes)(new ItemWitchesClothes(3)).setUnlocalizedName("witchery:rubyslippers").setTextureName("witchery:rubySlippers");
      this.SEEPING_SHOES = (ItemWitchesClothes)(new ItemWitchesClothes(3)).setUnlocalizedName("witchery:seepingshoes").setTextureName("witchery:seepingShoes");
      this.HUNTER_HAT = (ItemHunterClothes)(new ItemHunterClothes(0, false, false)).setUnlocalizedName("witchery:hunterhat").setTextureName("witchery:hunterhat");
      this.HUNTER_COAT = (ItemHunterClothes)(new ItemHunterClothes(1, false, false)).setUnlocalizedName("witchery:huntercoat").setTextureName("witchery:huntercoat");
      this.HUNTER_LEGS = (ItemHunterClothes)(new ItemHunterClothes(2, false, false)).setUnlocalizedName("witchery:hunterlegs").setTextureName("witchery:hunterlegs");
      this.HUNTER_BOOTS = (ItemHunterClothes)(new ItemHunterClothes(3, false, false)).setUnlocalizedName("witchery:hunterboots").setTextureName("witchery:hunterboots");
      this.HUNTER_HAT_SILVERED = (ItemHunterClothes)(new ItemHunterClothes(0, true, false)).setUnlocalizedName("witchery:hunterhatsilvered").setTextureName("witchery:hunterhat");
      this.HUNTER_COAT_SILVERED = (ItemHunterClothes)(new ItemHunterClothes(1, true, false)).setUnlocalizedName("witchery:huntercoatsilvered").setTextureName("witchery:huntercoat");
      this.HUNTER_LEGS_SILVERED = (ItemHunterClothes)(new ItemHunterClothes(2, true, false)).setUnlocalizedName("witchery:hunterlegssilvered").setTextureName("witchery:hunterlegs");
      this.HUNTER_BOOTS_SILVERED = (ItemHunterClothes)(new ItemHunterClothes(3, true, false)).setUnlocalizedName("witchery:hunterbootssilvered").setTextureName("witchery:hunterboots");
      this.HUNTER_HAT_GARLICKED = (ItemHunterClothes)(new ItemHunterClothes(0, true, true)).setUnlocalizedName("witchery:hunterhatgarlicked").setTextureName("witchery:hunterhat");
      this.HUNTER_COAT_GARLICKED = (ItemHunterClothes)(new ItemHunterClothes(1, true, true)).setUnlocalizedName("witchery:huntercoatgarlicked").setTextureName("witchery:huntercoat");
      this.HUNTER_LEGS_GARLICKED = (ItemHunterClothes)(new ItemHunterClothes(2, true, true)).setUnlocalizedName("witchery:hunterlegsgarlicked").setTextureName("witchery:hunterlegs");
      this.HUNTER_BOOTS_GARLICKED = (ItemHunterClothes)(new ItemHunterClothes(3, true, true)).setUnlocalizedName("witchery:hunterbootsgarlicked").setTextureName("witchery:hunterboots");
      this.DEATH_HOOD = (ItemDeathsClothes)(new ItemDeathsClothes(0)).setUnlocalizedName("witchery:deathscowl").setTextureName("witchery:deathscowl");
      this.DEATH_ROBE = (ItemDeathsClothes)(new ItemDeathsClothes(1)).setUnlocalizedName("witchery:deathsrobe").setTextureName("witchery:deathsrobe");
      this.DEATH_FEET = (ItemDeathsClothes)(new ItemDeathsClothes(3)).setUnlocalizedName("witchery:deathsfeet").setTextureName("witchery:deathsfeet");
      this.MOGS_QUIVER = (new ItemGoblinClothes(1)).setUnlocalizedName("witchery:quiverofmog").setTextureName("witchery:mogquiver");
      this.GULGS_GURDLE = (new ItemGoblinClothes(2)).setUnlocalizedName("witchery:gurdleofgulg").setTextureName("witchery:gulggurdle");
      this.KOBOLDITE_HELM = (new ItemGoblinClothes(0)).setUnlocalizedName("witchery:kobolditehelm").setTextureName("witchery:kobolditehelm");
      this.EARMUFFS = (new ItemEarmuffs(0)).setUnlocalizedName("witchery:earmuffs").setTextureName("witchery:earmuffs");
      this.VAMPIRE_HAT = (ItemVampireClothes)(new ItemVampireClothes(0, false, false)).setUnlocalizedName("witchery:vampirehat").setTextureName("witchery:vampirehat");
      this.VAMPIRE_HELMET = (ItemVampireClothes)(new ItemVampireClothes(0, false, true)).setUnlocalizedName("witchery:vampirehelmet").setTextureName("witchery:vampirehelmet");
      this.VAMPIRE_COAT = (ItemVampireClothes)(new ItemVampireClothes(1, false, false)).setUnlocalizedName("witchery:vampirecoat").setTextureName("witchery:vampirecoat");
      this.VAMPIRE_COAT_FEMALE = (ItemVampireClothes)(new ItemVampireClothes(1, true, false)).setUnlocalizedName("witchery:vampirecoat_female").setTextureName("witchery:vampirecoat");
      this.VAMPIRE_COAT_CHAIN = (ItemVampireClothes)(new ItemVampireClothes(1, false, true)).setUnlocalizedName("witchery:vampirechaincoat").setTextureName("witchery:vampirechaincoat");
      this.VAMPIRE_COAT_FEMALE_CHAIN = (ItemVampireClothes)(new ItemVampireClothes(1, true, true)).setUnlocalizedName("witchery:vampirechaincoat_female").setTextureName("witchery:vampirechaincoat");
      this.VAMPIRE_LEGS = (ItemVampireClothes)(new ItemVampireClothes(2, false, false)).setUnlocalizedName("witchery:vampirelegs").setTextureName("witchery:vampirelegs");
      this.VAMPIRE_LEGS_KILT = (ItemVampireClothes)(new ItemVampireClothes(2, true, false)).setUnlocalizedName("witchery:vampirelegs_kilt").setTextureName("witchery:vampirelegs_kilt");
      this.VAMPIRE_BOOTS = (ItemVampireClothes)(new ItemVampireClothes(3, false, false)).setUnlocalizedName("witchery:vampireboots").setTextureName("witchery:vampireboots");
      this.SEEDS_BELLADONNA = (new ItemWitchSeeds(Witchery.Blocks.CROP_BELLADONNA, new ItemStack(this.GENERIC, 1, this.GENERIC.itemBelladonnaFlower.damageValue), Blocks.farmland, false)).setUnlocalizedName("witchery:seedsbelladonna").setTextureName("witchery:ingredient.seedsBelladonna");
      this.SEEDS_MANDRAKE = (new ItemWitchSeeds(Witchery.Blocks.CROP_MANDRAKE, new ItemStack(this.GENERIC, 1, this.GENERIC.itemMandrakeRoot.damageValue), Blocks.farmland, false)).setUnlocalizedName("witchery:seedsmandrake").setTextureName("witchery:ingredient.seedsMandrake");
      this.SEEDS_ARTICHOKE = (new ItemWitchSeeds(Witchery.Blocks.CROP_ARTICHOKE, new ItemStack(this.GENERIC, 1, this.GENERIC.itemArtichoke.damageValue), Blocks.farmland, true)).setUnlocalizedName("witchery:seedsartichoke").setTextureName("witchery:ingredient.seedsArtichoke");
      this.SEEDS_SNOWBELL = (new ItemWitchSeeds(Witchery.Blocks.CROP_SNOWBELL, new ItemStack(Items.snowball), Blocks.farmland, false)).setUnlocalizedName("witchery:seedssnowbell").setTextureName("witchery:ingredient.seedsSnowbell");
      this.SEEDS_WORMWOOD = (new ItemWitchSeeds(Witchery.Blocks.CROP_WORMWOOD, new ItemStack(this.GENERIC, 1, this.GENERIC.itemWormwood.damageValue), Blocks.farmland, false)).setUnlocalizedName("witchery:seedswormwood").setTextureName("witchery:ingredient.seedswormwood");
      this.SEEDS_MINDRAKE = (new ItemWitchSeeds(Witchery.Blocks.CROP_MINDRAKE, (ItemStack)null, Blocks.farmland, false)).setUnlocalizedName("witchery:seedsmindrake").setTextureName("witchery:ingredient.mindrakebulb");
      this.SEEDS_WOLFSBANE = (new ItemWitchSeeds(Witchery.Blocks.CROP_WOLFSBANE, new ItemStack(this.GENERIC, 1, this.GENERIC.itemWolfsbane.damageValue), Blocks.farmland, false)).setUnlocalizedName("witchery:seedswolfsbane").setTextureName("witchery:ingredient.seedswolfsbane");
      this.SEEDS_GARLIC = (new ItemWitchSeeds(Witchery.Blocks.CROP_GARLIC, (ItemStack)null, Blocks.farmland, false)).setUnlocalizedName("witchery:garlic").setTextureName("witchery:garlic");
      this.BUCKET_FLOWINGSPIRIT = WitcheryFluids.bind((ItemBucketSpirit)(new ItemBucketSpirit()).setUnlocalizedName("witchery:bucketspirit").setTextureName("witchery:bucket_spirit").setContainerItem(Items.bucket), Witchery.Fluids.FLOWING_SPIRIT, Witchery.Blocks.FLOWING_SPIRIT);
      this.BUCKET_HOLLOWTEARS = WitcheryFluids.bind((ItemBucketSpirit)(new ItemBucketSpirit()).setUnlocalizedName("witchery:buckethollowtears").setTextureName("witchery:bucket_hollowtears").setContainerItem(Items.bucket), Witchery.Fluids.HOLLOW_TEARS, Witchery.Blocks.HOLLOW_TEARS);
      this.BUCKET_BREW = WitcheryFluids.bind((new ItemBrewBucket()).setUnlocalizedName("witchery:bucketbrew").setTextureName("witchery:bucket_brew").setContainerItem(Items.bucket), Witchery.Fluids.BREW, 1000);
   }
}
