package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public  class RpgPlayer {
    public static final int MAX_CARRYING_CAPACITY = 1000;

    protected final IGameEngine gameEngine;

    protected int health;

    protected int maxHealth;

    protected int armour;

    protected List<Item> inventory;

    // How much the player can carry in pounds
    protected int carryingCapacity;

    public ItemManage itemManage;
    public InventoryManage inventoryManage;
    public CombatManage combatManage;

    public RpgPlayer(IGameEngine gameEngine) {
        this.gameEngine = gameEngine;
        inventory = new ArrayList<Item>();
        carryingCapacity = MAX_CARRYING_CAPACITY;
        inventoryManage = new InventoryManage(gameEngine);
        itemManage = new ItemManage(gameEngine);
        combatManage = new CombatManage(gameEngine);
    }
}
