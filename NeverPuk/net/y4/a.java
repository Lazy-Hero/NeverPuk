package net.y4;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.y4.b;
import net.y4.p;
import net.y4.s;
import net.y4.v;

public abstract class a extends net.cn.w {
   private net.y4.z l;
   protected Long2ObjectMap y = new Long2ObjectOpenHashMap(1024);

   public abstract String O();

   protected final synchronized void S(net.yv.r var1, int var2, int var3, int var4, int var5, net.l.o var6) {
      this.e(var1);
      if(!this.y.containsKey(net.u.p.M(var2, var3))) {
         this.N.nextInt();
         if(this.Y(var2, var3)) {
            s var7 = this.z(var2, var3);
            this.y.put(net.u.p.M(var2, var3), var7);
            if(var7.d()) {
               this.d(var2, var3, var7);
            }
         }
      }

   }

   public synchronized boolean m(net.yv.r var1, Random var2, net.u.p var3) {
      this.e(var1);
      int var4 = (var3.i << 4) + 8;
      int var5 = (var3.y << 4) + 8;
      boolean var6 = false;
      ObjectIterator var7 = this.y.values().iterator();

      while(var7.hasNext()) {
         s var8 = (s)var7.next();
         if(var8.d() && var8.U(var3) && var8.r().D(var4, var5, var4 + 15, var5 + 15)) {
            var8.d(var1, var2, new v(var4, var5, var4 + 15, var5 + 15));
            var8.H(var3);
            var6 = true;
            this.d(var8.p(), var8.b(), var8);
         }
      }

      return var6;
   }

   public boolean Z(net.u.j var1) {
      if(this.Q == null) {
         return false;
      } else {
         this.e(this.Q);
         return this.L(var1) != null;
      }
   }

   @Nullable
   protected s L(net.u.j var1) {
      ObjectIterator var2 = this.y.values().iterator();

      label24:
      while(var2.hasNext()) {
         s var3 = (s)var2.next();
         if(var3.d() && var3.r().Y(var1)) {
            Iterator var4 = var3.o().iterator();

            while(true) {
               if(!var4.hasNext()) {
                  continue label24;
               }

               p var5 = (p)var4.next();
               if(var5.J().Y(var1)) {
                  break;
               }
            }

            return var3;
         }
      }

      return null;
   }

   public boolean o(net.yv.r var1, net.u.j var2) {
      this.e(var1);
      ObjectIterator var3 = this.y.values().iterator();

      while(var3.hasNext()) {
         s var4 = (s)var3.next();
         if(var4.d() && var4.r().Y(var2)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   public abstract net.u.j h(net.yv.r var1, net.u.j var2, boolean var3);

   protected void e(net.yv.r var1) {
      if(this.l == null) {
         this.l = (net.y4.z)var1.L(net.y4.z.class, this.O());
         if(this.l == null) {
            this.l = new net.y4.z(this.O());
            var1.Z((String)this.O(), (net.cg.h)this.l);
         } else {
            net.nj.f var2 = this.l.x();

            for(String var4 : var2.b()) {
               net.nj.q var5 = var2.m(var4);
               if(var5.C() == 10) {
                  net.nj.f var6 = (net.nj.f)var5;
                  if(var6.G("ChunkX") && var6.G("ChunkZ")) {
                     int var7 = var6.P("ChunkX");
                     int var8 = var6.P("ChunkZ");
                     s var9 = b.j(var6, var1);
                     this.y.put(net.u.p.M(var7, var8), var9);
                  }
               }
            }
         }
      }

   }

   private void d(int var1, int var2, s var3) {
      this.l.d(var3.D(var1, var2), var1, var2);
      this.l.f();
   }

   protected abstract boolean Y(int var1, int var2);

   protected abstract s z(int var1, int var2);

   protected static net.u.j O(net.yv.r var0, a var1, net.u.j var2, int var3, int var4, int var5, boolean var6, int var7, boolean var8) {
      int var10 = var2.t() >> 4;
      p.d();
      int var11 = var2.y() >> 4;
      int var12 = 0;
      Random var13 = new Random();
      if(var12 <= var7) {
         int var14 = -var12;
         boolean var15 = true;
         int var16 = -var12;
         boolean var10002 = true;
         int var18 = var10 + var3 * var14;
         int var19 = var11 + var3 * var16;
         if(var18 < 0) {
            var18 -= var3 - 1;
         }

         if(var19 < 0) {
            var19 -= var3 - 1;
         }

         int var20 = var18 / var3;
         int var21 = var19 / var3;
         Random var22 = var0.Y(var20, var21, var5);
         var20 = var20 * var3;
         var21 = var21 * var3;
         if(var6) {
            var20 += (var22.nextInt(var3 - var4) + var22.nextInt(var3 - var4)) / 2;
            var21 += (var22.nextInt(var3 - var4) + var22.nextInt(var3 - var4)) / 2;
         }

         var20 = var20 + var22.nextInt(var3 - var4);
         var21 = var21 + var22.nextInt(var3 - var4);
         net.cn.w.b(var0.a(), var13, var20, var21);
         var13.nextInt();
         if(var1.Y(var20, var21)) {
            if(!var8 || !var0.P(var20, var21)) {
               return new net.u.j((var20 << 4) + 8, 64, (var21 << 4) + 8);
            }
         }

         ++var16;
         ++var14;
         ++var12;
      }

      return null;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
