package europa.content
  
import arc.graphics.*;
import arc.struct.*;

import mindustry.type.*;

public class EuropaItems {
    // Modded
    public static Item
            // resources 
            lime, concrete, rust
  
    // Vanilla Items
    public static Item
            scrap, copper, lead, graphite, coal, titanium, thorium, silicon, plastanium,
            phaseFabric, surgeAlloy, sporePod, sand, blastCompound, pyratite, metaglass,
            beryllium, tungsten, oxide, carbide, fissileMatter, dormantCyst;

    public static void load() {
        lime = new Item("lime", Color.valueOf("c4bbb3")) {{
            hardness = 1;
            cost = 1f;
            alwaysUnlocked = true
        }};
        concrete = new Item("concrete", Color.valueOf("777777")) {{
            cost = 1f;
        }};
        rust = new Item("rust", Color.valueOf("662f1b")) {{
            cost = 1f;
        }};
    }
}
