package communityMod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import communityMod.client.ClientProxyCommunityMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Community_Mod", name = "Community_Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class CommunityMod {

	@SidedProxy(clientSide = "communityMod.client.ClientProxyCommunityMod",
				serverSide = "communityMod.common.CommonProxyCommunityMod")
	public static ClientProxyCommunityMod proxy = new ClientProxyCommunityMod();

	//Blocks
	public static Block siliconOre;
	public static Block leadOre;
	public static Block titaniumOre;
	public static Block leadBlock;
	public static Block titaniumBlock;
	public static Block copperOre;
	public static Block siliconBlock;
	public static Block ironGirder;
	public static Block concrete;
	public static Block ligniteOre;
	public static Block bituminousOre;
	public static Block anthraciteOre;
	public static Block platinumOre;
	public static Block tungstenOre;
	public static Block arsmiumOre;
	public static Block urdiumOre;
    public static Block franciumOre;
    public static Block franciumBlock;

	//Items
	public static Item leadIngot;
	public static Item titaniumIngot;
	public static Item copperIngot;
	public static Item siliconIngot;
	public static Item ligniteCoal;
	public static Item bituminousCoal;
	public static Item anthraciteCoal;
	public static Item platinumIngot;
	public static Item tungstenIngot;
	public static Item arsmiumIngot;
	public static Item urdiumIngot;
    public static Item franciumIngot;
    public static Item cosileadiumAlloy;

	//Block IDs
	public static int siliconOreID;
	public static int leadOreID;
	public static int titaniumOreID;
	public static int leadBlockID;
	public static int titaniumBlockID;
	public static int copperOreID;
	public static int siliconBlockID;
	public static int ironGirderID;
	public static int concreteID;
	public static int ligniteOreID;
	public static int bituminousOreID;
	public static int anthraciteOreID;
	public static int platinumOreID;
	public static int tungstenOreID;
	public static int arsmiumOreID;
	public static int urdiumOreID;
    public static int franciumOreID;
    public static int franciumBlockID;

	//Item IDs
	public static int leadIngotID;
	public static int titaniumIngotID;
	public static int copperIngotID;
	public static int siliconIngotID;
	public static int ligniteCoalID;
	public static int bituminousCoalID;
	public static int anthraciteCoalID;
	public static int platinumIngotID;
	public static int tungstenIngotID;
	public static int arsmiumIngotID;
	public static int urdiumIngotID;
    public static int franciumIngotID;
    public static int cosileadiumAlloyID;

	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		//Block IDs
		siliconOreID = config.get("Block IDs", "Silicon Ore ID", 700).getInt();
		leadOreID = config.get("Block IDs", "Lead Ore ID", 701).getInt();
		titaniumOreID = config.get("Block IDs", "Titanium Ore ID", 702).getInt();
		leadBlockID = config.get("Block IDs", "Lead Block ID", 703).getInt();
		titaniumBlockID = config.get("Block IDs", "Titanium Block ID", 704).getInt();
		copperOreID = config.get("Block IDs", "Copper Ore ID", 705).getInt();
		siliconBlockID = config.get("Block IDs", "Silicon Block ID", 706).getInt();
		ironGirderID = config.get("Block IDs", "Iron Girder ID", 707).getInt();
		concreteID = config.get("Block IDs", "Concrete ID", 708).getInt();
		ligniteOreID = config.get("Block IDs", "Lignite Ore ID", 709).getInt();
		bituminousOreID = config.get("Block IDs", "Bituminous Ore ID", 710).getInt();
		anthraciteOreID = config.get("Block IDs", "Anthracite Ore ID", 711).getInt();
		platinumOreID = config.get("Block IDs", "Platinum Ore ID", 712).getInt();
		tungstenOreID = config.get("Block IDs", "tungsten Ore ID", 713).getInt();
		arsmiumOreID = config.get("Block IDs", "Arsium Ore ID", 714).getInt();
		urdiumOreID = config.get("Block IDs", "Urdium Ore ID", 715).getInt();
        franciumOreID = config.get("Block IDs", "Francium Ore ID", 716).getInt();
        franciumBlockID = config.get("Block IDs", "Francium Block ID", 717).getInt();

		//Item IDs
		leadIngotID = config.get("Item IDs", "Lead Ingot ID", 1000).getInt();
		titaniumIngotID = config.get("Item IDs", "Titanium Ingot ID", 1001).getInt();
		copperIngotID = config.get("Item IDs", "Copper Ingot ID", 1002).getInt();
		siliconIngotID = config.get("Item IDs", "Silicon Ingot ID", 1003).getInt();
		ligniteCoalID = config.get("Item IDs", "Lignite ID", 1004).getInt();
		bituminousCoalID = config.get("Item IDs", "Bituminous Coal ID", 1005).getInt();
		anthraciteCoalID = config.get("Item IDs", "Anthracite ID", 1006).getInt();
		platinumIngotID = config.get("Item IDs", "Platinum Ingot ID", 1007).getInt();
		tungstenIngotID = config.get("Item IDs", "Tungsten Ingot ID", 1008).getInt();
		arsmiumIngotID = config.get("Item IDs", "Arsmium Ingot ID", 1009).getInt();
		urdiumIngotID = config.get("Item IDs", "Urdium Ingot ID", 1010).getInt();
        franciumIngotID = config.get("Item IDs", "Francium Ingot ID", 1011).getInt();
        cosileadiumAlloyID = config.get("Item IDs", "Cosileadium Alloy ID", 1012).getInt();

		config.save();
	}

	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenders();

		//Block Loading
		siliconOre = new BlockOre(siliconOreID, 0).setHardness(10F).setResistance(0.2F).setBlockName("SiliconOre").setCreativeTab(CreativeTabs.tabBlock);
		leadOre = new BlockOre(leadOreID, 1).setHardness(10F).setResistance(0.2F).setBlockName("LeadOre").setCreativeTab(CreativeTabs.tabBlock);
		titaniumOre = new BlockOre(titaniumOreID, 2).setHardness(10F).setResistance(0.2F).setBlockName("TitaniumOre").setCreativeTab(CreativeTabs.tabBlock);
		leadBlock = new BlockMetal(leadBlockID, 4).setHardness(12F).setResistance(10F).setBlockName("LeadBlock").setCreativeTab(CreativeTabs.tabBlock);
		titaniumBlock = new BlockMetal(titaniumBlockID, 3).setHardness(12F).setResistance(10F).setBlockName("TitaniumBlock").setCreativeTab(CreativeTabs.tabBlock);
		copperOre = new BlockOre(copperOreID, 6).setHardness(10F).setResistance(0.2F).setBlockName("CopperOre").setCreativeTab(CreativeTabs.tabBlock);
		siliconBlock = new BlockMetal(siliconBlockID, 5).setHardness(12F).setResistance(10F).setBlockName("SiliconBlock").setCreativeTab(CreativeTabs.tabBlock);
		ironGirder = new BlockIronGirder(ironGirderID, 8, Material.iron).setBlockName("Iron Girder").setHardness(2F).setStepSound(Block.soundMetalFootstep);
		concrete = new BlockConcrete(concreteID, 10, Material.iron).setBlockName("Concrete").setHardness(2F).setStepSound(Block.soundStoneFootstep);
		ligniteOre = new BlockOre(ligniteOreID, 11).setBlockName("LigniteOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CreativeTabs.tabBlock);
		bituminousOre = new BlockOre(bituminousOreID, 12).setBlockName("BituminousOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CreativeTabs.tabBlock);
		anthraciteOre = new BlockOre(anthraciteOreID, 13).setBlockName("AnthraciteOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CreativeTabs.tabBlock);
		platinumOre = new BlockOre(platinumOreID, 17).setHardness(18F).setResistance(22F).setBlockName("PlatinumOre").setCreativeTab(CreativeTabs.tabBlock);
		tungstenOre = new BlockOre(tungstenOreID, 19).setHardness(18F).setResistance(22F).setBlockName("TungstenOre").setCreativeTab(CreativeTabs.tabBlock);
		arsmiumOre = new BlockOre(arsmiumOreID, 18).setHardness(18F).setResistance(22F).setBlockName("ArsmiumOre").setCreativeTab(CreativeTabs.tabBlock);
		urdiumOre = new BlockOre(urdiumOreID, 16).setHardness(18F).setResistance(22F).setBlockName("UrdiumOre").setCreativeTab(CreativeTabs.tabBlock);
		franciumOre = new BlockOre(franciumOreID, 14).setHardness(18F).setResistance(22F).setBlockName("FranciumOre").setCreativeTab(CreativeTabs.tabBlock);
        franciumBlock = new BlockMetal(franciumBlockID, 15).setHardness(18F).setResistance(22F).setBlockName("FranciumOre").setCreativeTab(CreativeTabs.tabBlock);
        
		//Item Loading
		leadIngot = new ItemIngot(leadIngotID, 1).setCreativeTab(CreativeTabs.tabMaterials).setItemName("LeadIngot");
		titaniumIngot = new ItemIngot(titaniumIngotID, 0).setCreativeTab(CreativeTabs.tabMaterials).setItemName("TitaniumIngot");
		copperIngot = new ItemIngot(copperIngotID, 3).setCreativeTab(CreativeTabs.tabMaterials).setItemName("CopperIngot");
		siliconIngot = new ItemIngot(siliconIngotID, 2).setCreativeTab(CreativeTabs.tabMaterials).setItemName("SiliconIngot");
		ligniteCoal = new ItemCoal(ligniteCoalID, 4).setCreativeTab(CreativeTabs.tabMaterials).setItemName("Lignite");
		bituminousCoal = new ItemCoal(bituminousCoalID, 5).setCreativeTab(CreativeTabs.tabMaterials).setItemName("BituminousCoal");
		anthraciteCoal = new ItemCoal(anthraciteCoalID, 6).setCreativeTab(CreativeTabs.tabMaterials).setItemName("Anthracite");
		platinumIngot = new ItemIngot(platinumIngotID, 9).setCreativeTab(CreativeTabs.tabMaterials).setItemName("PlatinumIngot");
		tungstenIngot = new ItemIngot(tungstenIngotID, 11).setCreativeTab(CreativeTabs.tabMaterials).setItemName("TungstenIngot");
		arsmiumIngot = new ItemIngot(arsmiumIngotID, 10).setCreativeTab(CreativeTabs.tabMaterials).setItemName("ArsmiumIngot");
		urdiumIngot = new ItemIngot(urdiumIngotID, 8).setCreativeTab(CreativeTabs.tabMaterials).setItemName("UrdiumIngot");
        franciumIngot = new ItemIngot(franciumIngotID, 7).setCreativeTab(CreativeTabs.tabMaterials).setItemName("FranciumIngot");
        cosileadiumAlloy = new ItemIngot(cosileadiumAlloyID, 12).setCreativeTab(CreativeTabs.tabMaterials).setItemName("CosileadiumAlloy");
		
		gameRegisters();
		languageRegisters();
		craftingRecipes();
		smeltingRecipes();

		GameRegistry.registerWorldGenerator(new WorldGenOres());
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	private static void smeltingRecipes(){
		GameRegistry.addSmelting(leadOreID, new ItemStack(leadIngot, 1), 0.6F);
		GameRegistry.addSmelting(titaniumOreID, new ItemStack(titaniumIngot, 1), 0.75F);
		GameRegistry.addSmelting(siliconOreID, new ItemStack(siliconIngot, 1), 0.5F);
		GameRegistry.addSmelting(copperOreID, new ItemStack(copperIngot, 1), 0.5F);
		GameRegistry.addSmelting(platinumOreID, new ItemStack(copperIngot, 1), 0.5F);
		GameRegistry.addSmelting(tungstenOreID, new ItemStack(tungstenIngot, 1), 0.5F);
		GameRegistry.addSmelting(arsmiumOreID, new ItemStack(arsmiumIngot, 1), 0.5F);
		GameRegistry.addSmelting(urdiumOreID, new ItemStack(urdiumIngot, 1), 0.5F);
        GameRegistry.addSmelting(franciumOreID, new ItemStack(franciumIngot, 1), 0.5F);
	}

	private static void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(leadBlock, 1), new Object[]{
			"LLL",
			"LLL",
			"LLL",
			'L', leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(titaniumBlock, 1), new Object[]{
			"TTT",
			"TTT",
			"TTT",
			'T', titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(siliconBlock, 1), new Object[]{
			"SSS",
			"SSS",
			"SSS",
			'S', siliconIngot
		});
		GameRegistry.addRecipe(new ItemStack(ironGirder, 4), new Object[]{
			"III", " I ", "III", 'I', Item.ingotIron,
		});
        GameRegistry.addRecipe(new ItemStack(siliconBlock, 1), new Object[]{
			"FFF",
			"FFF",
			"FFF",
			'F', franciumIngot
		});
	}

	private static void gameRegisters(){
		//Block Registry
		GameRegistry.registerBlock(siliconOre, "SiliconOre");
		GameRegistry.registerBlock(leadOre, "LeadOre");
		GameRegistry.registerBlock(titaniumOre, "TitaniumOre");
		GameRegistry.registerBlock(leadBlock, "LeadBlock");
		GameRegistry.registerBlock(titaniumBlock, "TitaniumBlock");
		GameRegistry.registerBlock(copperOre, "CopperOre");
		GameRegistry.registerBlock(siliconBlock, "SiliconBlock");
		GameRegistry.registerBlock(ironGirder, "IronGirder");
		GameRegistry.registerBlock(concrete, "Concrete");
		GameRegistry.registerBlock(ligniteOre, "Lignite Ore");
		GameRegistry.registerBlock(bituminousOre, "Bituminous Ore");
		GameRegistry.registerBlock(anthraciteOre, "Anthracite Ore");
		GameRegistry.registerBlock(platinumOre, "PlatinumOre");
		GameRegistry.registerBlock(tungstenOre, "tungstenOre");
		GameRegistry.registerBlock(arsmiumOre, "ArsmiumOre");
		GameRegistry.registerBlock(urdiumOre, "UrdiumOre");
        GameRegistry.registerBlock(franciumOre, "FranciumOre");
        GameRegistry.registerBlock(franciumBlock, "FranciumBlock");

		//Item Registry
		GameRegistry.registerItem(leadIngot, "LeadIngot");
		GameRegistry.registerItem(titaniumIngot, "TitaniumIngot");
		GameRegistry.registerItem(copperIngot, "CopperIngot");
		GameRegistry.registerItem(siliconIngot, "SiliconIngot");
		GameRegistry.registerItem(ligniteCoal, "Lignite");
		GameRegistry.registerItem(bituminousCoal, "Bituminous Coal");
		GameRegistry.registerItem(anthraciteCoal, "Anthracite");
		GameRegistry.registerItem(platinumIngot, "PlatinumIngot");
		GameRegistry.registerItem(tungstenIngot, "tungstenIngot");
		GameRegistry.registerItem(arsmiumIngot, "ArsmiumShard");
		GameRegistry.registerItem(urdiumIngot, "UrdiumIngot");
        GameRegistry.registerItem(franciumIngot, "FranciumIngot");
        GameRegistry.registerItem(cosileadiumAlloy, "CosileadiumAlloy");
	}

	private static void languageRegisters(){
		//Block LanguageRegistry
		LanguageRegistry.addName(siliconOre, "Silicon Ore");
		LanguageRegistry.addName(leadOre, "Lead Ore");
		LanguageRegistry.addName(titaniumOre, "Titanium Ore");
		LanguageRegistry.addName(leadBlock, "Lead Block");
		LanguageRegistry.addName(titaniumBlock, "Titanium Block");
		LanguageRegistry.addName(copperOre, "Copper Ore");
		LanguageRegistry.addName(siliconBlock, "Silicon Block");
		LanguageRegistry.addName(ironGirder, "Iron Girder");
		LanguageRegistry.addName(concrete, "Concrete");
		LanguageRegistry.addName(ligniteOre, "Lignite Ore");
		LanguageRegistry.addName(bituminousOre, "Bituminous Coal Ore");
		LanguageRegistry.addName(anthraciteOre, "Anthracite Ore");
		LanguageRegistry.addName(platinumOre, "Platinum Ore");
		LanguageRegistry.addName(tungstenOre, "Tungsten Ore");
		LanguageRegistry.addName(arsmiumOre, "Arsmium Ore");
		LanguageRegistry.addName(urdiumOre, "Urdium Ore");
        LanguageRegistry.addName(franciumOre, "Francium Ore");
		LanguageRegistry.addName(franciumBlock, "Francium Block");

		//Item LanguageRegistry
		LanguageRegistry.addName(leadIngot, "Lead Ingot");
		LanguageRegistry.addName(titaniumIngot, "Titanium Ingot");
		LanguageRegistry.addName(copperIngot, "Copper Ingot");
		LanguageRegistry.addName(siliconIngot, "Silicon Ingot");
		LanguageRegistry.addName(ligniteCoal, "Lignite");
		LanguageRegistry.addName(bituminousCoal, "Bituminous Coal");
		LanguageRegistry.addName(anthraciteCoal, "Anthracite");
		LanguageRegistry.addName(platinumIngot, "Platinum Ingot");
		LanguageRegistry.addName(tungstenIngot, "Tungsten Ingot");
		LanguageRegistry.addName(arsmiumIngot, "Arsmium Ingot");
		LanguageRegistry.addName(urdiumIngot, "Urdium Ingot");
        LanguageRegistry.addName(franciumIngot, "Francium Ingot");
        LanguageRegistry.addName(cosileadiumAlloy, "Cosileadium Alloy");
	}
}
