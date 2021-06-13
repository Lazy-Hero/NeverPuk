package net.cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.cn.a;
import net.cn.e;
import net.cn.p;
import net.cn.w;
import net.l.o;
import net.ns.i;
import net.w.fu;
import net.y4.j;
import net.yv.r;

public class t implements e {
   private final r x;
   private final Random n;
   private final net.yw.n[] t;
   private final a H;
   private final Map w;
   private final boolean E;
   private final boolean l;
   private fu i;
   private fu M;

   public t(r var1, long var2, boolean var4, String var5) {
      w.S();
      super();
      this.t = new net.yw.n[256];
      this.w = new HashMap();
      this.x = var1;
      this.n = new Random(var2);
      this.H = a.n(var5);
      if(var4) {
         Map var7 = this.H.v();
         if(var7.containsKey("village")) {
            Map var8 = (Map)var7.get("village");
            if(!var8.containsKey("size")) {
               var8.put("size", "1");
            }

            this.w.put("Village", new net.y4.q(var8));
         }

         if(var7.containsKey("biome_1")) {
            this.w.put("Temple", new j((Map)var7.get("biome_1")));
         }

         if(var7.containsKey("mineshaft")) {
            this.w.put("Mineshaft", new net.y4.k((Map)var7.get("mineshaft")));
         }

         if(var7.containsKey("stronghold")) {
            this.w.put("Stronghold", new net.y4.l((Map)var7.get("stronghold")));
         }

         if(var7.containsKey("oceanmonument")) {
            this.w.put("Monument", new net.y4.y((Map)var7.get("oceanmonument")));
         }
      }

      if(this.H.v().containsKey("lake")) {
         this.i = new fu(net.nb.f.uM);
      }

      if(this.H.v().containsKey("lava_lake")) {
         this.M = new fu(net.nb.f.TL);
      }

      this.l = this.H.v().containsKey("dungeon");
      int var14 = 0;
      int var15 = 0;
      boolean var9 = true;
      Iterator var10 = this.H.N().iterator();
      if(var10.hasNext()) {
         p var11 = (p)var10.next();
         int var12 = var11.T();
         if(var12 < var11.T() + var11.Q()) {
            net.yw.n var13 = var11.N();
            if(var13.Q() != net.nb.f.ou) {
               var9 = false;
               this.t[var12] = var13;
            }

            ++var12;
         }

         if(var11.N().Q() == net.nb.f.ou) {
            var15 += var11.Q();
         }

         var14 += var11.Q() + var15;
         var15 = 0;
      }

      var1.l(var14);
      this.E = this.H.q() == i.y(net.nb.x.N) && this.H.v().containsKey("decoration");
   }

   public net.l.q g(int var1, int var2) {
      o var3 = new o();
      byte var4 = 0;
      if(var4 < this.t.length) {
         net.yw.n var11 = this.t[var4];
         byte var12 = 0;
         int var13 = 0;

         while(true) {
            var3.Q(var12, var4, var13, var11);
            ++var13;
         }
      }

      for(w var5 : this.w.values()) {
         var5.x(this.x, var1, var2, var3);
      }

      net.l.q var9 = new net.l.q(this.x, var3, var1, var2);
      i[] var10 = this.x.V().h((i[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var6 = var9.O();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)i.y(var10[var7]);
      }

      var9.Q();
      return var9;
   }

   public void u(int var1, int var2) {
      int var3 = var1 * 16;
      int var4 = var2 * 16;
      net.u.j var5 = new net.u.j(var3, 0, var4);
      i var6 = this.x.P(new net.u.j(var3 + 16, 0, var4 + 16));
      boolean var7 = false;
      this.n.setSeed(this.x.a());
      long var8 = this.n.nextLong() / 2L * 2L + 1L;
      long var10 = this.n.nextLong() / 2L * 2L + 1L;
      this.n.setSeed((long)var1 * var8 + (long)var2 * var10 ^ this.x.a());
      net.u.p var12 = new net.u.p(var1, var2);

      for(net.y4.a var14 : this.w.values()) {
         boolean var15 = var14.m(this.x, this.n, var12);
         if(var14 instanceof net.y4.q) {
            var7 |= var15;
         }
      }

      if(this.i != null && this.n.nextInt(4) == 0) {
         this.i.K(this.x, this.n, var5.F(this.n.nextInt(16) + 8, this.n.nextInt(256), this.n.nextInt(16) + 8));
      }

      if(this.M != null && this.n.nextInt(8) == 0) {
         net.u.j var16 = var5.F(this.n.nextInt(16) + 8, this.n.nextInt(this.n.nextInt(248) + 8), this.n.nextInt(16) + 8);
         if(var16.h() < this.x.k() || this.n.nextInt(10) == 0) {
            this.M.K(this.x, this.n, var16);
         }
      }

      if(this.l) {
         int var17 = 0;

         while(true) {
            (new net.w.s()).K(this.x, this.n, var5.F(this.n.nextInt(16) + 8, this.n.nextInt(256), this.n.nextInt(16) + 8));
            ++var17;
         }
      }

      if(this.E) {
         var6.f(this.x, this.n, var5);
      }

   }

   public boolean c(net.l.q var1, int var2, int var3) {
      return false;
   }

   public List x(net.ne.q var1, net.u.j var2) {
      i var3 = this.x.P(var2);
      return var3.v(var1);
   }

   @Nullable
   public net.u.j P(r var1, String var2, net.u.j var3, boolean var4) {
      net.y4.a var5 = (net.y4.a)this.w.get(var2);
      return var5.h(var1, var3, var4);
   }

   public boolean z(r var1, String var2, net.u.j var3) {
      net.y4.a var4 = (net.y4.a)this.w.get(var2);
      return var4.Z(var3);
   }

   public void W(net.l.q var1, int var2, int var3) {
      for(net.y4.a var5 : this.w.values()) {
         var5.x(this.x, var2, var3, (o)null);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
