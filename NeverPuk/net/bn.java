package net;

import net.mf;
import net.xn;
import net.u.j;
import net.yz.aq;

public enum bn {
   DOWN(aq.DOWN),
   UP(aq.UP),
   NORTH(aq.NORTH),
   SOUTH(aq.SOUTH),
   WEST(aq.WEST),
   EAST(aq.EAST),
   NORTH_WEST(aq.NORTH, aq.WEST),
   NORTH_EAST(aq.NORTH, aq.EAST),
   SOUTH_WEST(aq.SOUTH, aq.WEST),
   SOUTH_EAST(aq.SOUTH, aq.EAST),
   DOWN_NORTH(aq.DOWN, aq.NORTH),
   DOWN_SOUTH(aq.DOWN, aq.SOUTH),
   UP_NORTH(aq.UP, aq.NORTH),
   UP_SOUTH(aq.UP, aq.SOUTH),
   DOWN_WEST(aq.DOWN, aq.WEST),
   DOWN_EAST(aq.DOWN, aq.EAST),
   UP_WEST(aq.UP, aq.WEST),
   UP_EAST(aq.UP, aq.EAST);

   private final aq H;
   private aq G;

   private bn(aq var3) {
      this.H = var3;
   }

   private bn(aq var3, aq var4) {
      this.H = var3;
      this.G = var4;
   }

   public aq h() {
      return this.H;
   }

   public aq D() {
      return this.G;
   }

   j b(j var1) {
      String var2 = mf.O();
      var1 = var1.a(this.H, 1);
      if(this.G != null) {
         var1 = var1.a(this.G, 1);
      }

      return var1;
   }

   public int h() {
      int var1 = this.H.v();
      if(this.G != null) {
         var1 += this.G.v();
      }

      return var1;
   }

   public int a() {
      int var1 = this.H.z();
      if(this.G != null) {
         var1 += this.G.z();
      }

      return var1;
   }

   public int S() {
      int var1 = this.H.P();
      if(this.G != null) {
         var1 += this.G.P();
      }

      return var1;
   }

   public boolean o() {
      return this.G != null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
