package com.nelson131.itemplus.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class ItemManager {

    public static void init(){
        createCobweb();
        createDebug();
        createChainmailHelmet();
        createChainmailChestplate();
        createChainmailLeggings();
        createChainmailBoots();
        createDiamondHorseArmor();
        createGoldHorseArmor();
        createIronHorseArmor();
    }

    private  static void createCobweb(){
        ItemStack cobweb = new ItemStack(Material.COBWEB, 1);
        ShapedRecipe Cobwebr = new ShapedRecipe(cobweb);
        Cobwebr.shape("AAA","ABA","AAA");
        Cobwebr.setIngredient('A', Material.STRING);
        Cobwebr.setIngredient('B', Material.WHITE_WOOL);
        Bukkit.getServer().addRecipe(Cobwebr);
    }
    private static void createDebug(){
        ItemStack debugstick = new ItemStack(Material.DEBUG_STICK, 1);
        ShapedRecipe Debugst = new ShapedRecipe(debugstick);
        Debugst.shape(" A "," B "," A ");
        Debugst.setIngredient('A', Material.BLAZE_ROD);
        Debugst.setIngredient('B', Material.REDSTONE_BLOCK);
        Bukkit.getServer().addRecipe(Debugst);
    }
    private static void createChainmailHelmet(){
        ItemStack chainmailhelmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ShapedRecipe chHelmet = new ShapedRecipe(chainmailhelmet);
        chHelmet.shape("AAA","A A","   ");
        chHelmet.setIngredient('A', Material.CHAIN);
        Bukkit.getServer().addRecipe(chHelmet);
    }
    private static void createChainmailChestplate(){
        ItemStack chainmailchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ShapedRecipe chChestplate = new ShapedRecipe(chainmailchestplate);
        chChestplate.shape("A A","AAA","AAA");
        chChestplate.setIngredient('A', Material.CHAIN);
        Bukkit.getServer().addRecipe(chChestplate);
    }
    private static void createChainmailLeggings(){
        ItemStack chainmailLeggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        ShapedRecipe chLeggings = new ShapedRecipe(chainmailLeggings);
        chLeggings.shape("AAA", "A A","A A");
        chLeggings.setIngredient('A', Material.CHAIN);
        Bukkit.getServer().addRecipe(chLeggings);
    }
    private static void createChainmailBoots(){
        ItemStack chainmailBoots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ShapedRecipe chBoots = new ShapedRecipe(chainmailBoots);
        chBoots.shape("A A","A A","   ");
        chBoots.setIngredient('A', Material.CHAIN);
        Bukkit.getServer().addRecipe(chBoots);
    }
    private static void createIronHorseArmor(){
        ItemStack ironHorseArmor = new ItemStack(Material.IRON_HORSE_ARMOR, 1);
        ShapedRecipe ironHA = new ShapedRecipe(ironHorseArmor);
        ironHA.shape("  A","ABA","A A");
        ironHA.setIngredient('A', Material.IRON_INGOT);
        ironHA.setIngredient('B', Material.SADDLE);
        Bukkit.getServer().addRecipe(ironHA);
    }
    private static void createGoldHorseArmor(){
        ItemStack goldnHorseArmor = new ItemStack(Material.GOLDEN_HORSE_ARMOR, 1);
        ShapedRecipe goldHA = new ShapedRecipe(goldnHorseArmor);
        goldHA.shape("  A","ABA","A A");
        goldHA.setIngredient('A', Material.GOLD_INGOT);
        goldHA.setIngredient('B', Material.SADDLE);
        Bukkit.getServer().addRecipe(goldHA);
    }
    private static void createDiamondHorseArmor(){
        ItemStack diamondHorseArmor = new ItemStack(Material.DIAMOND_HORSE_ARMOR, 1);
        ShapedRecipe diamondHA = new ShapedRecipe(diamondHorseArmor);
        diamondHA.shape("  A","ABA","A A");
        diamondHA.setIngredient('A', Material.DIAMOND);
        diamondHA.setIngredient('B', Material.SADDLE);
        Bukkit.getServer().addRecipe(diamondHA);
    }

}
