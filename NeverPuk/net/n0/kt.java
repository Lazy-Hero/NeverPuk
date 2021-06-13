package net.n0;

public enum kt {
   COMMON(net.cb.z.WHITE, "Common"),
   UNCOMMON(net.cb.z.YELLOW, "Uncommon"),
   RARE(net.cb.z.AQUA, "Rare"),
   EPIC(net.cb.z.LIGHT_PURPLE, "Epic");

   public final net.cb.z rarityColor;
   public final String rarityName;

   private kt(net.cb.z var3, String var4) {
      this.rarityColor = var3;
      this.rarityName = var4;
   }
}
