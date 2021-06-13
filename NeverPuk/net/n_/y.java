package net.n_;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.x7;
import net.xn;
import net.z9;
import net.n0.ks;
import net.n_.b;
import net.n_.f;
import net.n_.i;
import net.nj.h;
import net.s.k;
import net.yq.e;
import net.yz.m_;

public class y {
   public static List y(ks var0) {
      return o(var0.o());
   }

   public static List T(b var0, Collection var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.addAll(var0.s());
      var2.addAll(var1);
      return var2;
   }

   public static List o(@Nullable net.nj.f var0) {
      ArrayList var1 = Lists.newArrayList();
      var1.addAll(N(var0).s());
      b((net.nj.f)var0, (List)var1);
      return var1;
   }

   public static List Z(ks var0) {
      return p(var0.o());
   }

   public static List p(@Nullable net.nj.f var0) {
      ArrayList var1 = Lists.newArrayList();
      b((net.nj.f)var0, (List)var1);
      return var1;
   }

   public static void b(@Nullable net.nj.f var0, List var1) {
      if(var0.K("CustomPotionEffects", 9)) {
         h var2 = var0.A("CustomPotionEffects", 10);

         for(int var3 = 0; var3 < var2.z(); ++var3) {
            net.nj.f var4 = var2.i(var3);
            i var5 = i.s(var4);
            var1.add(var5);
         }
      }

   }

   public static int N(ks var0) {
      net.nj.f var1 = var0.o();
      return var1.K("CustomPotionColor", 99)?var1.P("CustomPotionColor"):(h(var0) == net.nb.w.j?16253176:S(y(var0)));
   }

   public static int X(b var0) {
      return var0 == net.nb.w.j?16253176:S(var0.s());
   }

   public static int S(Collection var0) {
      int var1 = 3694022;
      if(var0.isEmpty()) {
         return z9.v()?x7.c((f)null, var1):3694022;
      } else {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = 0.0F;
         int var5 = 0;

         for(i var7 : var0) {
            if(var7.q()) {
               int var8 = var7.i().t();
               if(z9.v()) {
                  var8 = x7.c(var7.i(), var8);
               }

               int var9 = var7.d() + 1;
               var2 += (float)(var9 * (var8 >> 16 & 255)) / 255.0F;
               var3 += (float)(var9 * (var8 >> 8 & 255)) / 255.0F;
               var4 += (float)(var9 * (var8 >> 0 & 255)) / 255.0F;
               var5 += var9;
            }
         }

         return 0;
      }
   }

   public static b h(ks var0) {
      return N(var0.o());
   }

   public static b N(@Nullable net.nj.f var0) {
      return net.nb.w.j;
   }

   public static ks b(ks var0, b var1) {
      m_ var2 = (m_)b.b.t(var1);
      if(var1 == net.nb.w.j) {
         if(var0.D()) {
            net.nj.f var3 = var0.o();
            var3.A("Potion");
            if(var3.N()) {
               var0.t((net.nj.f)null);
            }
         }
      } else {
         net.nj.f var4 = var0.D()?var0.o():new net.nj.f();
         var4.b("Potion", var2.toString());
         var0.t(var4);
      }

      return var0;
   }

   public static ks u(ks var0, Collection var1) {
      if(var1.isEmpty()) {
         return var0;
      } else {
         net.nj.f var2 = (net.nj.f)MoreObjects.firstNonNull(var0.o(), new net.nj.f());
         h var3 = var2.A("CustomPotionEffects", 9);

         for(i var5 : var1) {
            var3.m(var5.t(new net.nj.f()));
         }

         var2.K("CustomPotionEffects", var3);
         var0.t(var2);
         return var0;
      }
   }

   public static void j(ks var0, List var1, float var2) {
      i.M();
      List var4 = y(var0);
      ArrayList var5 = Lists.newArrayList();
      if(var4.isEmpty()) {
         String var6 = e.E("effect.none").trim();
         var1.add(net.cb.z.GRAY + var6);
      }

      Iterator var15 = var4.iterator();
      if(var15.hasNext()) {
         i var7 = (i)var15.next();
         String var8 = e.E(var7.V()).trim();
         f var9 = var7.i();
         Map var10 = var9.z();
         if(!var10.isEmpty()) {
            Iterator var11 = var10.entrySet().iterator();
            if(var11.hasNext()) {
               Entry var12 = (Entry)var11.next();
               k var13 = (k)var12.getValue();
               k var14 = new k(var13.b(), var9.y(var7.d(), var13), var13.X());
               var5.add(new net.yz.y(((net.s.b)var12.getKey()).K(), var14));
            }
         }

         if(var7.d() > 0) {
            var8 = var8 + " " + e.E("potion.potency." + var7.d()).trim();
         }

         if(var7.S() > 20) {
            var8 = var8 + " (" + f.q(var7, var2) + ")";
         }

         if(var9.d()) {
            var1.add(net.cb.z.RED + var8);
         }

         var1.add(net.cb.z.BLUE + var8);
      }

      if(!var5.isEmpty()) {
         var1.add("");
         var1.add(net.cb.z.DARK_PURPLE + e.E("potion.whenDrank"));
         var15 = var5.iterator();
         if(var15.hasNext()) {
            net.yz.y var17 = (net.yz.y)var15.next();
            k var18 = (k)var17.I();
            double var19 = var18.e();
            if(var18.X() != 1 && var18.X() != 2) {
               double var20 = var18.e();
            }

            double var21 = var18.e() * 100.0D;
            if(Double.compare(var19, 0.0D) > 0) {
               var1.add(net.cb.z.BLUE + e.x("attribute.modifier.plus." + var18.X(), new Object[]{ks.x.format(var21), e.E("attribute.name." + (String)var17.e())}));
            }

            if(var19 < 0.0D) {
               var21 = var21 * -1.0D;
               var1.add(net.cb.z.RED + e.x("attribute.modifier.take." + var18.X(), new Object[]{ks.x.format(var21), e.E("attribute.name." + (String)var17.e())}));
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
