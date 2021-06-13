package net.ni;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.ni.w;
import net.yz.a7;
import net.yz.ae;
import net.yz.ai;
import net.yz.m_;

public abstract class r {
   private int j = 20;
   private final List w = Lists.newArrayList();
   private ae o = new ae();
   private double S;
   private double u;
   private int K = 200;
   private int T = 800;
   private int h = 4;
   private net.ne.l N;
   private int z = 6;
   private int e = 16;
   private int a = 4;

   @Nullable
   private m_ s() {
      String var1 = this.o.x().J("id");
      return a7.Y(var1)?null:new m_(var1);
   }

   public void S(@Nullable m_ var1) {
      this.o.x().b("id", var1.toString());
   }

   private boolean k() {
      net.u.j var1 = this.P();
      return this.k().g((double)var1.t() + 0.5D, (double)var1.h() + 0.5D, (double)var1.y() + 0.5D, (double)this.e);
   }

   public void i() {
      int[] var1 = w.C();
      if(!this.k()) {
         this.u = this.S;
      }

      net.u.j var2 = this.P();
      if(this.k().x) {
         double var3 = (double)((float)var2.t() + this.k().G.nextFloat());
         double var5 = (double)((float)var2.h() + this.k().G.nextFloat());
         double var7 = (double)((float)var2.y() + this.k().G.nextFloat());
         this.k().n(ai.SMOKE_NORMAL, var3, var5, var7, 0.0D, 0.0D, 0.0D, new int[0]);
         this.k().n(ai.FLAME, var3, var5, var7, 0.0D, 0.0D, 0.0D, new int[0]);
         if(this.j > 0) {
            --this.j;
         }

         this.u = this.S;
         this.S = (this.S + (double)(1000.0F / ((float)this.j + 200.0F))) % 360.0D;
      }

      if(this.j == -1) {
         this.B();
      }

      if(this.j > 0) {
         --this.j;
      } else {
         boolean var18 = false;
         byte var4 = 0;
         if(var4 < this.h) {
            net.nj.f var19 = this.o.x();
            net.nj.h var6 = var19.A("Pos", 6);
            net.yv.r var20 = this.k();
            int var8 = var6.z();
            double var9 = var8 >= 1?var6.U(0):(double)var2.t() + (var20.G.nextDouble() - var20.G.nextDouble()) * (double)this.a + 0.5D;
            double var11 = var8 >= 2?var6.U(1):(double)(var2.h() + var20.G.nextInt(3) - 1);
            double var13 = var8 >= 3?var6.U(2):(double)var2.y() + (var20.G.nextDouble() - var20.G.nextDouble()) * (double)this.a + 0.5D;
            net.ne.l var15 = net.ny.k.A(var19, var20, var9, var11, var13, false);
         }
      }
   }

   private void B() {
      if(this.T <= this.K) {
         this.j = this.K;
      } else {
         int var1 = this.T - this.K;
         this.j = this.K + this.k().G.nextInt(var1);
      }

      if(!this.w.isEmpty()) {
         this.U((ae)net.yz.b.g(this.k().G, this.w));
      }

      this.Y(1);
   }

   public void u(net.nj.f var1) {
      this.j = var1.E("Delay");
      this.w.clear();
      if(var1.K("SpawnPotentials", 9)) {
         net.nj.h var2 = var1.A("SpawnPotentials", 10);

         for(int var3 = 0; var3 < var2.z(); ++var3) {
            this.w.add(new ae(var2.i(var3)));
         }
      }

      if(var1.K("SpawnData", 10)) {
         this.U(new ae(1, var1.o("SpawnData")));
      } else if(!this.w.isEmpty()) {
         this.U((ae)net.yz.b.g(this.k().G, this.w));
      }

      if(var1.K("MinSpawnDelay", 99)) {
         this.K = var1.E("MinSpawnDelay");
         this.T = var1.E("MaxSpawnDelay");
         this.h = var1.E("SpawnCount");
      }

      if(var1.K("MaxNearbyEntities", 99)) {
         this.z = var1.E("MaxNearbyEntities");
         this.e = var1.E("RequiredPlayerRange");
      }

      if(var1.K("SpawnRange", 99)) {
         this.a = var1.E("SpawnRange");
      }

      if(this.k() != null) {
         this.N = null;
      }

   }

   public net.nj.f y(net.nj.f var1) {
      m_ var2 = this.s();
      return var1;
   }

   public net.ne.l A() {
      if(this.N == null) {
         this.N = net.ny.k.Y(this.o.x(), this.k(), false);
         if(this.o.x().y() == 1 && this.o.x().K("id", 8) && this.N instanceof net.ne.y) {
            ((net.ne.y)this.N).t(this.k().G(new net.u.j(this.N)), (net.ne.g)null);
         }
      }

      return this.N;
   }

   public boolean l(int var1) {
      if(var1 == 1 && this.k().x) {
         this.j = this.K;
         return true;
      } else {
         return false;
      }
   }

   public void U(ae var1) {
      this.o = var1;
   }

   public abstract void Y(int var1);

   public abstract net.yv.r k();

   public abstract net.u.j P();

   public double z() {
      return this.S;
   }

   public double Z() {
      return this.u;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
