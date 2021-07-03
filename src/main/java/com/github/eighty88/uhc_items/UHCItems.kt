package com.github.eighty88.uhc_items

import org.bukkit.*
import org.bukkit.attribute.Attribute
import org.bukkit.attribute.AttributeModifier
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.inventory.meta.LeatherArmorMeta
import org.bukkit.inventory.meta.PotionMeta
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import java.util.*


class UHCItems : JavaPlugin() {
    override fun onEnable() {
        logger.info("Plugin Enabled!")
        VorpalSword()
        BookofSharpness()
        BookofPower()
        DragonSword()
        LeatherEconomy()
        BookofProtection()
        BookofArtemis()
        DragonArmor()
        IronPack()
        PhPick()
        DustofLight()
        BrewingArtifact()
        NetherArtifact()
        Necter()
        Stakes()
        PotionofTouchness()
        SpikedArmor()
        SeavenLeagueBoots()
        Obsidian()
        Tarnhelm()
        EvesTemplation()
        HealingFruit()
        HolyWater()
        LightApple()
        EnlighteningPack()
        LightAnvil()
        LightEnchantingTable()
        BookofThoth()
        ArrowEconomy()
        Saddle()
        PotionofVelocity()
        Fenrir()
    }

    fun VorpalSword() {
        val Item = ItemStack(Material.IRON_SWORD)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Vorpal Sword")
        Meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 2, true)
        Meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 2, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "VorpalSword_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "ASA", "ARA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.BONE)
        ItemRecipe.setIngredient('S', Material.IRON_SWORD)
        ItemRecipe.setIngredient('R', Material.ROTTEN_FLESH)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun BookofSharpness() {
        val Item = ItemStack(Material.ENCHANTED_BOOK)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Book of Sharpness")
        Meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "SharpBook_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("FAA", "APP", "APS")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('F', Material.FLINT)
        ItemRecipe.setIngredient('P', Material.PAPER)
        ItemRecipe.setIngredient('S', Material.IRON_SWORD)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun BookofPower() {
        val Item = ItemStack(Material.ENCHANTED_BOOK)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Book of Power")
        Meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "PowerBook_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("FAA", "APP", "APB")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('F', Material.FLINT)
        ItemRecipe.setIngredient('P', Material.PAPER)
        ItemRecipe.setIngredient('B', Material.BONE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun DragonSword() {
        val Item = ItemStack(Material.DIAMOND_SWORD)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Dragon Sword")
        Meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(UUID.randomUUID(), "generic.attack_damage", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND))
        Meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(UUID.randomUUID(), "generic.attack_damage", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND))
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "DragonSword_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("APA", "ASA", "OPO")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('S', Material.DIAMOND_SWORD)
        ItemRecipe.setIngredient('P', Material.BLAZE_POWDER)
        ItemRecipe.setIngredient('O', Material.OBSIDIAN)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun LeatherEconomy() {
        val Item = ItemStack(Material.LEATHER, 8)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Leather Economy")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "LeatherEconomy_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("SLS", "SLS", "SLS")
        ItemRecipe.setIngredient('S', Material.STICK)
        ItemRecipe.setIngredient('L', Material.LEATHER)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun BookofProtection() {
        val Item = ItemStack(Material.ENCHANTED_BOOK)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Book of Protection")
        Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "BookofProtection_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "APP", "API")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('I', Material.IRON_INGOT)
        ItemRecipe.setIngredient('P', Material.PAPER)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun BookofArtemis() {
        val Item = ItemStack(Material.ENCHANTED_BOOK)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Book of Artemis")
        Meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "BookofArtemis_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "APP", "API")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('I', Material.ARROW)
        ItemRecipe.setIngredient('P', Material.PAPER)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun DragonArmor() {
        val Item = ItemStack(Material.DIAMOND_CHESTPLATE)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Dragon Sword")
        Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "DragonArmor_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ACA", "APA", "OVO")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('C', Material.MAGMA_CREAM)
        ItemRecipe.setIngredient('V', Material.ANVIL)
        ItemRecipe.setIngredient('O', Material.OBSIDIAN)
        ItemRecipe.setIngredient('P', Material.DIAMOND_CHESTPLATE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun IronPack() {
        val Item = ItemStack(Material.IRON_INGOT, 10)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Packed Iron")
        Meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "IronPack_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "AIA", "AAA")
        ItemRecipe.setIngredient('A', Material.IRON_ORE)
        ItemRecipe.setIngredient('I', Material.COAL)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun PhPick() {
        val Item = ItemStack(Material.DIAMOND_PICKAXE, 1, 1552)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Philiosopher's Pickaxe")
        Meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true)
        Meta.addEnchant(Enchantment.DURABILITY, 3, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "PhPick_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "CDC", "EDE")
        ItemRecipe.setIngredient('A', Material.IRON_ORE)
        ItemRecipe.setIngredient('B', Material.GOLD_ORE)
        ItemRecipe.setIngredient('C', Material.LAPIS_BLOCK)
        ItemRecipe.setIngredient('D', Material.STICK)
        ItemRecipe.setIngredient('E', Material.AIR)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun DustofLight() {
        val Item = ItemStack(Material.GLOWSTONE_DUST, 8)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Dust of Light")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "DustofLight_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "ABA", "AAA")
        ItemRecipe.setIngredient('A', Material.REDSTONE_WIRE)
        ItemRecipe.setIngredient('B', Material.FLINT_AND_STEEL)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun BrewingArtifact() {
        val Item = ItemStack(Material.NETHER_WART)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Brewing Artifact")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "BrewingArtifact_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "BCB", "ABA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.WHEAT_SEEDS)
        ItemRecipe.setIngredient('C', Material.FERMENTED_SPIDER_EYE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun Necter() {
        val Item = ItemStack(Material.POTION)
        val Meta = Item.itemMeta as PotionMeta?
        Meta!!.addCustomEffect(PotionEffect(PotionEffectType.REGENERATION, 200, 1, true), true)
        Meta.color = Color.BLUE
        Meta.setDisplayName(ChatColor.RESET.toString() + "Necter")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "Necter_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ACA", "BDB", "AEA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.GOLD_INGOT)
        ItemRecipe.setIngredient('C', Material.EMERALD)
        ItemRecipe.setIngredient('D', Material.MELON_SLICE)
        ItemRecipe.setIngredient('E', Material.GLASS_BOTTLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun NetherArtifact() {
        val Item = ItemStack(Material.BLAZE_ROD, 1)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Nether Artifact")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "NetherArtifact_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "ACA", "ABA")
        ItemRecipe.setIngredient('A', Material.ORANGE_STAINED_GLASS)
        ItemRecipe.setIngredient('B', Material.LAVA_BUCKET)
        ItemRecipe.setIngredient('C', Material.FIREWORK_ROCKET)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun Stakes() {
        val Item = ItemStack(Material.COOKED_BEEF, 10)
        val Meta = Item.itemMeta
        Meta?.setDisplayName(ChatColor.RESET.toString() + "Stakes")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "Stakes_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "ABA", "AAA")
        ItemRecipe.setIngredient('A', Material.BEEF)
        ItemRecipe.setIngredient('B', Material.COAL)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun PotionofTouchness() {
        val Item = ItemStack(Material.POTION)
        val Meta = Item.itemMeta as PotionMeta?
        Meta!!.addCustomEffect(PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 2400, 1, true), true)
        Meta.color = Color.BLUE
        Meta.setDisplayName(ChatColor.RESET.toString() + "Potion of Toughness")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "PotionofToughness_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "ACA", "ADA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.SLIME_BALL)
        ItemRecipe.setIngredient('C', Material.SNOW_BLOCK)
        ItemRecipe.setIngredient('D', Material.GLASS_BOTTLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun SpikedArmor() {
        val Item = ItemStack(Material.LEATHER_CHESTPLATE)
        val Meta = Item.itemMeta as LeatherArmorMeta?
        if (Meta != null) {
            Meta.setDisplayName(ChatColor.RESET.toString() + "Spiked Armor")
            Meta.setColor(Color.AQUA)
            Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true)
            Meta.addEnchant(Enchantment.DURABILITY, 10, true)
            Meta.addEnchant(Enchantment.THORNS, 1, true)
        }
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "SpikedArmor_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "ACA", "ADA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.LILY_PAD)
        ItemRecipe.setIngredient('C', Material.CACTUS)
        ItemRecipe.setIngredient('D', Material.LEATHER_CHESTPLATE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun SeavenLeagueBoots() {
        val Item = ItemStack(Material.DIAMOND_BOOTS)
        val Meta = Item.itemMeta
        if (Meta != null) {
            Meta.setDisplayName(ChatColor.RESET.toString() + "Seven-League Boots")
            Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true)
            Meta.addEnchant(Enchantment.PROTECTION_FALL, 3, true)
        }
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "DiaBoots_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "ACA", "ADA")
        ItemRecipe.setIngredient('A', Material.FEATHER)
        ItemRecipe.setIngredient('B', Material.ENDER_PEARL)
        ItemRecipe.setIngredient('C', Material.DIAMOND_BOOTS)
        ItemRecipe.setIngredient('D', Material.WATER_BUCKET)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun Obsidian() {
        val Item = ItemStack(Material.OBSIDIAN)
        val Meta = Item.itemMeta
        Meta?.setDisplayName(ChatColor.RESET.toString() + "Obsidian")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "Obsidian_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "ABA", "ACA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.LAVA_BUCKET)
        ItemRecipe.setIngredient('C', Material.WATER_BUCKET)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun Tarnhelm() {
        val Item = ItemStack(Material.LEATHER_CHESTPLATE)
        val Meta = Item.itemMeta
        if (Meta != null) {
            Meta.setDisplayName(ChatColor.RESET.toString() + "Tarnhelm")
            Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true)
            Meta.addEnchant(Enchantment.PROTECTION_FIRE, 1, true)
            Meta.addEnchant(Enchantment.WATER_WORKER, 1, true)
        }
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "Tarnhelm_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("BCB", "BDB", "AAA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.DIAMOND)
        ItemRecipe.setIngredient('C', Material.IRON_INGOT)
        ItemRecipe.setIngredient('D', Material.REDSTONE_BLOCK)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun EvesTemplation() {
        val Item = ItemStack(Material.APPLE, 2)
        val ItemKey = NamespacedKey(this, "EvesTemplation_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "ABA", "ACA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.BONE_MEAL)
        ItemRecipe.setIngredient('C', Material.APPLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun HealingFruit() {
        val Item = ItemStack(Material.MELON_SLICE)
        val ItemKey = NamespacedKey(this, "HealingFruit_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "BCB", "ABA")
        ItemRecipe.setIngredient('A', Material.BONE_MEAL)
        ItemRecipe.setIngredient('B', Material.WHEAT_SEEDS)
        ItemRecipe.setIngredient('C', Material.APPLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun HolyWater() {
        val Item = ItemStack(Material.LEATHER_CHESTPLATE)
        val Meta = Item.itemMeta
        Meta?.setDisplayName(ChatColor.RESET.toString() + "Holy Water")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "HolyWater_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("EBE", "ACA", "ADA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.REDSTONE_BLOCK)
        ItemRecipe.setIngredient('C', Material.MUSIC_DISC_11)
        ItemRecipe.setIngredient('D', Material.GLASS_BOTTLE)
        ItemRecipe.setIngredient('E', Material.GOLD_INGOT)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun LightApple() {
        val Item = ItemStack(Material.GOLDEN_APPLE)
        val Meta = Item.itemMeta
        Meta?.setDisplayName(ChatColor.RESET.toString() + "Light Apple")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "LightApple_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "BCB", "ABA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.GOLD_INGOT)
        ItemRecipe.setIngredient('C', Material.APPLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun EnlighteningPack() {
        val Item = ItemStack(Material.EXPERIENCE_BOTTLE, 8)
        val ItemKey = NamespacedKey(this, "EnlighteningPack_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "BCB", "ABA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.REDSTONE_BLOCK)
        ItemRecipe.setIngredient('C', Material.GLASS_BOTTLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun LightAnvil() {
        val Item = ItemStack(Material.CHIPPED_ANVIL)
        val Meta = Item.itemMeta
        Meta?.setDisplayName(ChatColor.RESET.toString() + "Light Anvil")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "LightAnvil_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "BCB", "AAA")
        ItemRecipe.setIngredient('A', Material.IRON_INGOT)
        ItemRecipe.setIngredient('B', Material.AIR)
        ItemRecipe.setIngredient('C', Material.IRON_BLOCK)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun LightEnchantingTable() {
        val Item = ItemStack(Material.CHIPPED_ANVIL)
        val Meta = Item.itemMeta
        Meta?.setDisplayName(ChatColor.RESET.toString() + "Light Enchanting Table")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "LightEnchantingTable_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "CDC", "CEC")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.BOOKSHELF)
        ItemRecipe.setIngredient('C', Material.OBSIDIAN)
        ItemRecipe.setIngredient('D', Material.DIAMOND)
        ItemRecipe.setIngredient('E', Material.EXPERIENCE_BOTTLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun BookofThoth() {
        val Item = ItemStack(Material.ENCHANTED_BOOK)
        val Meta = Item.itemMeta
        Meta!!.setDisplayName(ChatColor.RESET.toString() + "Book of Thoth")
        Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true)
        Meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true)
        Meta.addEnchant(Enchantment.ARROW_DAMAGE, 2, true)
        Meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true)
        Meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true)
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "BookofThoth_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("BAA", "APP", "API")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.ENDER_EYE)
        ItemRecipe.setIngredient('I', Material.FIRE_CHARGE)
        ItemRecipe.setIngredient('P', Material.PAPER)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun ArrowEconomy() {
        val Item = ItemStack(Material.ARROW, 20)
        val ItemKey = NamespacedKey(this, "ArrowEconomy_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "BBB", "CCC")
        ItemRecipe.setIngredient('A', Material.FLINT)
        ItemRecipe.setIngredient('B', Material.STICK)
        ItemRecipe.setIngredient('C', Material.FEATHER)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun Saddle() {
        val Item = ItemStack(Material.SADDLE)
        val ItemKey = NamespacedKey(this, "Saddle_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "BAB", "CDC")
        ItemRecipe.setIngredient('A', Material.LEATHER)
        ItemRecipe.setIngredient('B', Material.STRING)
        ItemRecipe.setIngredient('C', Material.IRON_INGOT)
        ItemRecipe.setIngredient('D', Material.AIR)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun Fenrir() {
        val Item = ItemStack(Material.WOLF_SPAWN_EGG)
        val ItemKey = NamespacedKey(this, "Fenrir_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("AAA", "BCB", "AAA")
        ItemRecipe.setIngredient('A', Material.LEATHER)
        ItemRecipe.setIngredient('B', Material.BONE)
        ItemRecipe.setIngredient('C', Material.EXPERIENCE_BOTTLE)
        Bukkit.addRecipe(ItemRecipe)
    }

    fun PotionofVelocity() {
        val Item = ItemStack(Material.POTION)
        val Meta = Item.itemMeta as PotionMeta?
        Meta!!.addCustomEffect(PotionEffect(PotionEffectType.SPEED, 240, 3, true), true)
        Meta.color = Color.BLUE
        Meta.setDisplayName(ChatColor.RESET.toString() + "Potion of Velocity (0.12)")
        Item.itemMeta = Meta
        val ItemKey = NamespacedKey(this, "PotionofVelocity_key")
        val ItemRecipe = ShapedRecipe(ItemKey, Item)
        ItemRecipe.shape("ABA", "ACA", "ADA")
        ItemRecipe.setIngredient('A', Material.AIR)
        ItemRecipe.setIngredient('B', Material.COCOA_BEANS)
        ItemRecipe.setIngredient('C', Material.SUGAR)
        ItemRecipe.setIngredient('D', Material.GLASS_BOTTLE)
        Bukkit.addRecipe(ItemRecipe)
    }
}
