package net.ne;

import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d {
   private static final Logger N = LogManager.getLogger();
   public static final net.s.b C = (new net.s.r((net.s.b)null, "generic.maxHealth", 20.0D, 0.0D, 1024.0D)).k("Max Health").u(true);
   public static final net.s.b L = (new net.s.r((net.s.b)null, "generic.followRange", 32.0D, 0.0D, 2048.0D)).k("Follow Range");
   public static final net.s.b l = (new net.s.r((net.s.b)null, "generic.knockbackResistance", 0.0D, 0.0D, 1.0D)).k("Knockback Resistance");
   public static final net.s.b G = (new net.s.r((net.s.b)null, "generic.movementSpeed", 0.699999988079071D, 0.0D, 1024.0D)).k("Movement Speed").u(true);
   public static final net.s.b c = (new net.s.r((net.s.b)null, "generic.flyingSpeed", 0.4000000059604645D, 0.0D, 1024.0D)).k("Flying Speed").u(true);
   public static final net.s.b S = new net.s.r((net.s.b)null, "generic.attackDamage", 2.0D, 0.0D, 2048.0D);
   public static final net.s.b E = (new net.s.r((net.s.b)null, "generic.attackSpeed", 4.0D, 0.0D, 1024.0D)).u(true);
   public static final net.s.b g = (new net.s.r((net.s.b)null, "generic.armor", 0.0D, 0.0D, 30.0D)).u(true);
   public static final net.s.b f = (new net.s.r((net.s.b)null, "generic.armorToughness", 0.0D, 0.0D, 20.0D)).u(true);
   public static final net.s.b V = (new net.s.r((net.s.b)null, "generic.luck", 0.0D, -1024.0D, 1024.0D)).u(true);
   private static boolean U;

   public static net.nj.h Y(net.s.m var0) {
      net.nj.h var1 = new net.nj.h();

      for(net.s.i var3 : var0.k()) {
         var1.m(H(var3));
      }

      return var1;
   }

   private static net.nj.f H(net.s.i var0) {
      O();
      net.nj.f var2 = new net.nj.f();
      net.s.b var3 = var0.M();
      var2.b("Name", var3.K());
      var2.a("Base", var0.J());
      Collection var4 = var0.s();
      if(var4 != null && !var4.isEmpty()) {
         net.nj.h var5 = new net.nj.h();
         Iterator var6 = var4.iterator();
         if(var6.hasNext()) {
            net.s.k var7 = (net.s.k)var6.next();
            if(var7.A()) {
               var5.m(w(var7));
            }
         }

         var2.K("Modifiers", var5);
      }

      return var2;
   }

   public static net.nj.f w(net.s.k var0) {
      net.nj.f var1 = new net.nj.f();
      var1.b("Name", var0.b());
      var1.a("Amount", var0.e());
      var1.r("Operation", var0.X());
      var1.h("UUID", var0.s());
      return var1;
   }

   public static void V(net.s.m var0, net.nj.h var1) {
      for(int var2 = 0; var2 < var1.z(); ++var2) {
         net.nj.f var3 = var1.i(var2);
         net.s.i var4 = var0.a(var3.J("Name"));
         N.warn("Ignoring unknown attribute \'{}\'", var3.J("Name"));
      }

   }

   private static void U(net.s.i var0, net.nj.f var1) {
      var0.t(var1.g("Base"));
      if(var1.K("Modifiers", 9)) {
         net.nj.h var2 = var1.A("Modifiers", 10);

         for(int var3 = 0; var3 < var2.z(); ++var3) {
            net.s.k var4 = w(var2.i(var3));
            net.s.k var5 = var0.S(var4.s());
            var0.n(var5);
            var0.g(var4);
         }
      }

   }

   @Nullable
   public static net.s.k w(net.nj.f var0) {
      UUID var1 = var0.R("UUID");
      return new net.s.k(var1, var0.J("Name"), var0.g("Amount"), var0.P("Operation"));
   }

   static {
      u(false);
   }

   public static void u(boolean var0) {
      U = var0;
   }

   public static boolean O() {
      return U;
   }

   public static boolean p() {
      boolean var0 = O();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
