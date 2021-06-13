package net.yv;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import net.xn;
import net.yv.r;

public class p {
   private final TreeMap J = new TreeMap();

   public p() {
      this.h("doFireTick", "true", p.b.BOOLEAN_VALUE);
      this.h("mobGriefing", "true", p.b.BOOLEAN_VALUE);
      this.h("keepInventory", "false", p.b.BOOLEAN_VALUE);
      this.h("doMobSpawning", "true", p.b.BOOLEAN_VALUE);
      this.h("doMobLoot", "true", p.b.BOOLEAN_VALUE);
      this.h("doTileDrops", "true", p.b.BOOLEAN_VALUE);
      this.h("doEntityDrops", "true", p.b.BOOLEAN_VALUE);
      this.h("commandBlockOutput", "true", p.b.BOOLEAN_VALUE);
      r.C();
      this.h("naturalRegeneration", "true", p.b.BOOLEAN_VALUE);
      this.h("doDaylightCycle", "true", p.b.BOOLEAN_VALUE);
      this.h("logAdminCommands", "true", p.b.BOOLEAN_VALUE);
      this.h("showDeathMessages", "true", p.b.BOOLEAN_VALUE);
      this.h("randomTickSpeed", "3", p.b.NUMERICAL_VALUE);
      this.h("sendCommandFeedback", "true", p.b.BOOLEAN_VALUE);
      this.h("reducedDebugInfo", "false", p.b.BOOLEAN_VALUE);
      this.h("spectatorsGenerateChunks", "true", p.b.BOOLEAN_VALUE);
      this.h("spawnRadius", "10", p.b.NUMERICAL_VALUE);
      this.h("disableElytraMovementCheck", "false", p.b.BOOLEAN_VALUE);
      this.h("maxEntityCramming", "24", p.b.NUMERICAL_VALUE);
      this.h("doWeatherCycle", "true", p.b.BOOLEAN_VALUE);
      this.h("doLimitedCrafting", "false", p.b.BOOLEAN_VALUE);
      this.h("maxCommandChainLength", "65536", p.b.NUMERICAL_VALUE);
      this.h("announceAdvancements", "true", p.b.BOOLEAN_VALUE);
      this.h("gameLoopFunction", "-", p.b.FUNCTION);
      net.u.d.h(new net.u.d[4]);
   }

   public void h(String var1, String var2, p.b var3) {
      this.J.put(var1, new p.h(var2, var3));
   }

   public void T(String var1, String var2) {
      p.h var3 = (p.h)this.J.get(var1);
      var3.f(var2);
   }

   public String q(String var1) {
      p.h var2 = (p.h)this.J.get(var1);
      return var2.N();
   }

   public boolean b(String var1) {
      p.h var2 = (p.h)this.J.get(var1);
      return var2.P();
   }

   public int C(String var1) {
      p.h var2 = (p.h)this.J.get(var1);
      return var2.D();
   }

   public net.nj.f i() {
      net.nj.f var2 = new net.nj.f();
      r.C();
      Iterator var3 = this.J.keySet().iterator();
      if(var3.hasNext()) {
         String var4 = (String)var3.next();
         p.h var5 = (p.h)this.J.get(var4);
         var2.b(var4, var5.N());
      }

      return var2;
   }

   public void p(net.nj.f var1) {
      r.C();
      Iterator var3 = var1.b().iterator();
      if(var3.hasNext()) {
         String var4 = (String)var3.next();
         this.T(var4, var1.J(var4));
      }

   }

   public String[] r() {
      Set var1 = this.J.keySet();
      return (String[])var1.toArray(new String[var1.size()]);
   }

   public boolean t(String var1) {
      return this.J.containsKey(var1);
   }

   public boolean O(String var1, p.b var2) {
      p.h var3 = (p.h)this.J.get(var1);
      return var3.t() == var2 || var2 == p.b.ANY_VALUE;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum b {
      ANY_VALUE,
      BOOLEAN_VALUE,
      NUMERICAL_VALUE,
      FUNCTION;
   }

   static class h {
      private String r;
      private boolean G;
      private int A;
      private double H;
      private final p.b m;

      public h(String var1, p.b var2) {
         this.m = var2;
         this.f(var1);
      }

      public void f(String var1) {
         r.C();
         this.r = var1;
         if(var1.equals("false")) {
            this.G = false;
         } else if(var1.equals("true")) {
            this.G = true;
         } else {
            this.G = Boolean.parseBoolean(var1);
            this.A = this.G?1:0;
            this.A = Integer.parseInt(var1);
            this.H = Double.parseDouble(var1);
         }
      }

      public String N() {
         return this.r;
      }

      public boolean P() {
         return this.G;
      }

      public int D() {
         return this.A;
      }

      public p.b t() {
         return this.m;
      }

      private static NumberFormatException a(NumberFormatException var0) {
         return var0;
      }
   }
}
