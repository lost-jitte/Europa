package biotech.content;

import arc.Core;
import arc.graphics.Color;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.type.unit.MissileUnitType;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.blocks.distribution.BufferedItemBridge;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.distribution.Router;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidBridge;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.blocks.units.Reconstructor;
import mindustry.world.blocks.units.UnitCargoLoader;
import mindustry.world.blocks.units.UnitCargoUnloadPoint;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.Category.*;
import static mindustry.type.ItemStack.with;

public class EuropaBlocks {
    public static Block
            // Storage
            coreSeadrome,
            // Drills
            // Factories
            sieve, concreteMixer,
            // Environment
            // Turrets
            // Power
            rustNode
            // Walls
            // Units
    ;

    public static void load() {
        Sieve = new GenericCrafter("sieve") {{
            researchCost = with(Items.copper, 40);
            requirements(crafting, with(Items.copper, 20));
            size = 1;
            craftTime = 60f
            outputItem = new ItemStack(EuropaItems.rust, 1);
            craftEffect = Fx.pulverize;
            consumeLiquid(Liquids.water)
        }}
        ConcreteMixer = new GenericCrafter("concrete-mixer") {{
            researchCost = with(Items.copper, 60, EuropaItems.lime, 40, EuropaItems.rust, 30);
            requirements(crafting, with(Items.copper, 30, EuropaItems.lime, 20, EuropaItems.rust, 15));
            size = 2;
            craftTime = 60f
            outputItem = new ItemStack(EuropaItems.concrete, 1);
            craftEffect = Fx.pulverize;
            consumeLiquid(Liquids.water, 0.25);
            consumeItem(EuropaItems.lime, 2)
        }}
    }
}
