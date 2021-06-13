package net.z;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import net.i6;
import net.xn;
import net.y.ui;
import net.yz.aq;
import net.z.g;
import net.z.r;
import net.z.t;
import org.lwjgl.opengl.Display;

public class ta extends g {
   private final net.nn.j K;
   private final r t;

   public ta(net.nn.j var1) {
      this.K = var1;
      this.t = var1.sO;
   }

   public void O(t var1) {
      this.K.sl.K("debug");
      net.y.d.c();
      this.u();
      this.R(var1);
      net.y.d.Y();
      if(this.K.T.j) {
         this.s();
      }

      this.K.sl.N();
   }

   protected void u() {
      List var1 = this.r();
      var1.add("");
      var1.add("Debug: Pie [shift]: " + (this.K.T.iU?"visible":"hidden") + " FPS [alt]: " + (this.K.T.j?"visible":"hidden"));
      var1.add("For help: press F3 + Q");

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         String var3 = (String)var1.get(var2);
         if(!Strings.isNullOrEmpty(var3)) {
            int var4 = this.t.R;
            int var5 = this.t.r(var3);
            boolean var10000 = true;
            int var7 = 2 + var4 * var2;
            u(1, var7 - 1, 2 + var5 + 1, var7 + var4 - 1, -1873784752);
            this.t.v(var3, 2.0F, (float)var7, 14737632);
         }
      }

   }

   protected void R(t var1) {
      List var2 = this.J();

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         String var4 = (String)var2.get(var3);
         if(!Strings.isNullOrEmpty(var4)) {
            int var5 = this.t.R;
            int var6 = this.t.r(var4);
            int var7 = var1.u() - 2 - var6;
            int var8 = 2 + var5 * var3;
            u(var7 - 1, var8 - 1, var7 + var6 + 1, var8 + var5 - 1, -1873784752);
            this.t.v(var4, (float)var7, (float)var8, 14737632);
         }
      }

   }

   protected List r() {
      g.C();
      net.u.j var2 = new net.u.j(this.K.A().b, this.K.A().i().u, this.K.A().hr);
      if(this.K.P()) {
         return Lists.newArrayList(new String[]{"Minecraft 1.12.2 (" + this.K.W() + "/" + net.nn.p.S() + ")", this.K.c, this.K.o.t(), this.K.o.v(), "P: " + this.K.sv.J() + ". T: " + this.K.s8.k(), this.K.s8.l(), "", String.format("Chunk-relative: %d %d %d", new Object[]{Integer.valueOf(var2.t() & 15), Integer.valueOf(var2.h() & 15), Integer.valueOf(var2.y() & 15)})});
      } else {
         net.ne.l var3 = this.K.A();
         aq var4 = var3.V();
         String var5 = "Invalid";
         switch(null.s[var4.ordinal()]) {
         case 1:
            var5 = "Towards negative Z";
         case 2:
            var5 = "Towards positive Z";
         case 3:
            var5 = "Towards negative X";
         case 4:
            var5 = "Towards positive X";
         default:
            ArrayList var6 = Lists.newArrayList(new String[]{"Minecraft 1.12.2 (" + this.K.W() + "/" + net.nn.p.S() + ("release".equalsIgnoreCase(this.K.i())?"":"/" + this.K.i()) + ")", this.K.c, this.K.o.t(), this.K.o.v(), "P: " + this.K.sv.J() + ". T: " + this.K.s8.k(), this.K.s8.l(), "", String.format("XYZ: %.3f / %.5f / %.3f", new Object[]{Double.valueOf(this.K.A().b), Double.valueOf(this.K.A().i().u), Double.valueOf(this.K.A().hr)}), String.format("Block: %d %d %d", new Object[]{Integer.valueOf(var2.t()), Integer.valueOf(var2.h()), Integer.valueOf(var2.y())}), String.format("Chunk: %d %d %d in %d %d %d", new Object[]{Integer.valueOf(var2.t() & 15), Integer.valueOf(var2.h() & 15), Integer.valueOf(var2.y() & 15), Integer.valueOf(var2.t() >> 4), Integer.valueOf(var2.h() >> 4), Integer.valueOf(var2.y() >> 4)}), String.format("Facing: %s (%s) (%.1f / %.1f)", new Object[]{var4, var5, Float.valueOf(net.u.t.k(var3.hN)), Float.valueOf(net.u.t.k(var3.V))})});
            if(this.K.s8 != null) {
               net.l.q var7 = this.K.s8.d(var2);
               if(this.K.s8.o(var2) && var2.h() >= 0 && var2.h() < 256) {
                  if(!var7.z()) {
                     var6.add("Biome: " + var7.b(var2, this.K.s8.V()).l());
                     var6.add("Light: " + var7.j(var2, 0) + " (" + var7.C(net.yv.w.SKY, var2) + " sky, " + var7.C(net.yv.w.BLOCK, var2) + " block)");
                     net.yv.g var8 = this.K.s8.G(var2);
                     if(this.K.w() && this.K.V() != null) {
                        net.r.h var9 = this.K.V().c().l(this.K.sf.O());
                        var8 = var9.hl.G(new net.u.j(var9));
                     }

                     var6.add(String.format("Local Difficulty: %.2f // %.2f (Day %d)", new Object[]{Float.valueOf(var8.V()), Float.valueOf(var8.l()), Long.valueOf(this.K.s8.j() / 24000L)}));
                  }

                  var6.add("Waiting for chunk...");
               }

               var6.add("Outside of world...");
            }

            if(this.K.s4 != null && this.K.s4.w()) {
               var6.add("Shader: " + this.K.s4.U().W());
            }

            if(this.K.H != null && this.K.H.v == net.u.m.BLOCK && this.K.H.j() != null) {
               net.u.j var13 = this.K.H.j();
               var6.add(String.format("Looking at: %d %d %d", new Object[]{Integer.valueOf(var13.t()), Integer.valueOf(var13.h()), Integer.valueOf(var13.y())}));
            }

            return var6;
         }
      }
   }

   protected List J() {
      long var1 = Runtime.getRuntime().maxMemory();
      long var3 = Runtime.getRuntime().totalMemory();
      long var5 = Runtime.getRuntime().freeMemory();
      long var7 = var3 - var5;
      ArrayList var9 = Lists.newArrayList(new String[]{String.format("Java: %s %dbit", new Object[]{System.getProperty("java.version"), Integer.valueOf(this.K.X()?64:32)}), String.format("Mem: % 2d%% %03d/%03dMB", new Object[]{Long.valueOf(var7 * 100L / var1), Long.valueOf(Y(var7)), Long.valueOf(Y(var1))}), String.format("Allocated: % 2d%% %03dMB", new Object[]{Long.valueOf(var3 * 100L / var1), Long.valueOf(Y(var3))}), "", String.format("CPU: %s", new Object[]{ui.A()}), "", String.format("Display: %dx%d (%s)", new Object[]{Integer.valueOf(Display.getWidth()), Integer.valueOf(Display.getHeight()), net.y.d.F(7936)}), net.y.d.F(7937), net.y.d.F(7938)});
      if(i6.BI.r()) {
         Object var10 = i6.H(i6.MN, new Object[0]);
         var9.add("");
         var9.addAll((Collection)i6.b(var10, i6.BI, new Object[]{Boolean.valueOf(false)}));
      }

      if(this.K.P()) {
         return var9;
      } else {
         if(this.K.H != null && this.K.H.v == net.u.m.BLOCK && this.K.H.j() != null) {
            net.u.j var17 = this.K.H.j();
            net.yw.n var11 = this.K.s8.Z(var17);
            if(this.K.s8.t() != net.yv.j.J) {
               var11 = var11.J(this.K.s8, var17);
            }

            var9.add("");
            var9.add(String.valueOf(net.y9.l.m.t(var11.Q())));

            net.yr.h var12;
            String var13;
            for(UnmodifiableIterator var14 = var11.A().entrySet().iterator(); var14.hasNext(); var9.add(var12.l() + ": " + var13)) {
               Entry var15 = (Entry)var14.next();
               var12 = (net.yr.h)var15.getKey();
               Comparable var16 = (Comparable)var15.getValue();
               var13 = var12.p(var16);
               if(Boolean.TRUE.equals(var16)) {
                  var13 = net.cb.z.GREEN + var13;
               } else if(Boolean.FALSE.equals(var16)) {
                  var13 = net.cb.z.RED + var13;
               }
            }
         }

         return var9;
      }
   }

   private void s() {
   }

   private int W(int var1, int var2, int var3, int var4) {
      return var1 < var3?this.p(-16711936, -256, (float)var1 / (float)var3):this.p(-256, -65536, (float)(var1 - var3) / (float)(var4 - var3));
   }

   private int p(int var1, int var2, float var3) {
      int var4 = var1 >> 24 & 255;
      int var5 = var1 >> 16 & 255;
      int var6 = var1 >> 8 & 255;
      int var7 = var1 & 255;
      int var8 = var2 >> 24 & 255;
      int var9 = var2 >> 16 & 255;
      int var10 = var2 >> 8 & 255;
      int var11 = var2 & 255;
      int var12 = net.u.t.g((int)((float)var4 + (float)(var8 - var4) * var3), 0, 255);
      int var13 = net.u.t.g((int)((float)var5 + (float)(var9 - var5) * var3), 0, 255);
      int var14 = net.u.t.g((int)((float)var6 + (float)(var10 - var6) * var3), 0, 255);
      int var15 = net.u.t.g((int)((float)var7 + (float)(var11 - var7) * var3), 0, 255);
      return var12 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   private static long Y(long var0) {
      return var0 / 1024L / 1024L;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
