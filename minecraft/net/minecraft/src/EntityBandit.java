package net.minecraft.src;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityBandit extends EntityMob
{
    private float moveSpeed;
	public EntityBandit(World par1World)
    {
        super(par1World);
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos1.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos1.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos3.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos3.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTD.class, this.moveSpeed, false));

        this.moveSpeed = 0.5F;
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKing.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKing.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKingsGuard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKingsGuard.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWolf.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityOcelot.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHellhound.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWhiteKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWhiteKnight.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGreenDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGreenDragon.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGuard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGuard.class, this.moveSpeed, false));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWizard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWizard.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFarmer.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityFarmer.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHeroKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHeroKnight.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBarbarian.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBarbarian.class, this.moveSpeed, false));
    }
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(400.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.55D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(11.0D);
	    }
    
    
    public String getEntityName()
    {
      return "Bandit Leader";
    }
    
    public boolean isAIEnabled()
    {
        return true;
    }
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

      
    }



    protected Entity findPlayerToAttack()
    {
        float var1 = this.getBrightness(1.0F);

        if (var1 < 0.5F)
        {
            double var2 = 16.0D;
            return this.worldObj.getClosestVulnerablePlayerToEntity(this, var2);
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
protected String getLivingSound()
    {
        return "mob.villager.default";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.villager.defaulthurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.villager.defaultdeath";
    }
    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int var1, int var2, int var3, int var4)
    {
        this.worldObj.playSoundAtEntity(this, "mob.villager.default", 0.15F, 1.0F);
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity par1Entity, float par2)
    {
        float var3 = this.getBrightness(1.0F);

        if (var3 > 0.5F && this.rand.nextInt(100) == 0)
        {
            this.entityToAttack = null;
        }
        else
        {
            if (par2 > 2.0F && par2 < 6.0F && this.rand.nextInt(10) == 0)
            {
                if (this.onGround)
                {
                    double var4 = par1Entity.posX - this.posX;
                    double var6 = par1Entity.posZ - this.posZ;
                    float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
                    this.motionX = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.motionX * 0.20000000298023224D;
                    this.motionZ = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.20000000298023224D;
                    this.motionY = 0.4000000059604645D;
                }
            }
            else
            {
                super.attackEntity(par1Entity, par2);
            }
        }
    }

    
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(1) + 1;
        int quickvar1 = rand.nextInt(40) + 1;
        int quickvar2 = rand.nextInt(400) + 1;
        int quickvar3 = rand.nextInt(1) + 1;
        int quickvar4 = rand.nextInt(30) + 1;
        int quickvar5 = rand.nextInt(10) + 1;
        int quickvar6 = rand.nextInt(200) + 1;
        int quickvar7 = rand.nextInt(10) + 1;
        int quickvar8 = rand.nextInt(12) + 1;
        int quickvar9 = rand.nextInt(1) + 1;
        int quickvar10 = rand.nextInt(1) + 1;
         
        if(quickvar <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.Blacksword), 1);}
        if(quickvar1 <= 1){entityDropItem(new ItemStack(mod_phat.blackgLeggings), 1);}
        if(quickvar2 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.keris), 1);}
        if(quickvar3 <= 2){entityDropItem(new ItemStack(mod_Flower.fishpie), 3);}
        if(quickvar4 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.dlong), 1);}
        if(quickvar5 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.BlackHalberd), 1);}
        if(quickvar10 <= 1){entityDropItem(new ItemStack(Block.coalBlock), 1);}
        if(quickvar7 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.Addysword), 1);}
        if(quickvar8 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.AddyHammer), 1);}
        if(quickvar9 <= 1){entityDropItem(new ItemStack(Item.ingotGold), 1);}
        
        
        
        //Medium value table//
        if(quickvar6 >5 && quickvar6<=10){entityDropItem(new ItemStack(Item.ingotGold), 1);}
        if(quickvar6 >10 && quickvar6<=15){entityDropItem(new ItemStack(mod_BlocksGalore.Mithore), 1);}
        if(quickvar6 >15 && quickvar6<=20){entityDropItem(new ItemStack(mod_BlocksGalore.Whitesword), 1);}
        if(quickvar6 >20 && quickvar6<=25){entityDropItem(new ItemStack(mod_BlocksGalore.Blacksword), 1);}
        if(quickvar6 >25 && quickvar6<=30){entityDropItem(new ItemStack(mod_phat.blackLeggings), 1);}
        if(quickvar6 >30 && quickvar6<=35){entityDropItem(new ItemStack(mod_phat.blackBoots), 1);}
        if(quickvar6 >35 && quickvar6<=50){entityDropItem(new ItemStack(Item.coal,3), 1);}
        if(quickvar6 >50 && quickvar6<=55){entityDropItem(new ItemStack(mod_BlocksGalore.Mithore), 1);}
        if(quickvar6 >50 && quickvar6<=55){entityDropItem(new ItemStack(mod_BlocksGalore.Addyore), 1);}
        if(quickvar6 >55 && quickvar6<=75){entityDropItem(new ItemStack(Item.arrow,10), 1);}
        if(quickvar6 >75 && quickvar6<=85){entityDropItem(new ItemStack(Item.wheat,10), 1);}
        if(quickvar6 >85 && quickvar6<=90){entityDropItem(new ItemStack(mod_Flower.antifire), 1);}
        if(quickvar6 >85 && quickvar6<=90){entityDropItem(new ItemStack(mod_Flower.sarabrew), 1);}
        if(quickvar6 >85 && quickvar6<=90){entityDropItem(new ItemStack(mod_Flower.superstr), 1);}
        if(quickvar6 >85 && quickvar6<=90){entityDropItem(new ItemStack(mod_Flower.superdef), 1);}
        if(quickvar6 >90 && quickvar6<=91){entityDropItem(new ItemStack(mod_BlocksGalore.Runeaxe), 1);}
        if(quickvar6 >91 && quickvar6<=92){entityDropItem(new ItemStack(mod_BlocksGalore.Runesword), 1);}
        if(quickvar6 >92 && quickvar6<=93){entityDropItem(new ItemStack(mod_BlocksGalore.Runeshovel), 1);}
        if(quickvar6 >93 && quickvar6<=94){entityDropItem(new ItemStack(mod_BlocksGalore.Runepickaxe), 1);}
        if(quickvar6 >94 && quickvar6<=95){entityDropItem(new ItemStack(mod_BlocksGalore.Runelump), 1);}
        
int XP = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.XPORB), 1);}
        }

   


    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }

    
    public void onLivingUpdate()
    {
      	if(ticksExisted > 220 * 20) setDead(); 
        	super.onLivingUpdate();
        }
        
    private static final ItemStack defaultHeldItem;
    public ItemStack getHeldItem()
         {
                 return defaultHeldItem;
         }

 static
         {
                 defaultHeldItem = new ItemStack(mod_BlocksGalore.Blacksword, 1);
         }
    
	
 public void func_82163_bD()
 {
 	 
 	 this.setCanPickUpLoot(this.rand.nextFloat() < equipmentDropChances[this.worldObj.difficultySetting]);
 	   if (this.getCurrentItemOrArmor(4) == null){
 	
 		
        this.setCurrentItemOrArmor(1, new ItemStack(mod_phat.blackgBoots));
        this.setCurrentItemOrArmor(2, new ItemStack(mod_phat.blackgLeggings));
        this.setCurrentItemOrArmor(3, new ItemStack(mod_phat.guardChestplate));
         this.equipmentDropChances[4] = 0.0F;
     
          
      }
 }

}
