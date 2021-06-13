package net.y7;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;
import net.g.s;
import net.n0.ks;
import net.n0.y;
import net.y7.o;
import net.y7.p;
import net.y7.r;
import net.yz.m_;

public class x extends o {
   protected final y g;
   protected final net.o.a[] C;

   public x(y var1, int var2, int var3, net.o.a[] var4, net.g.x[] var5) {
      super(var2, var3, var5);
      this.g = var1;
      this.C = var4;
   }

   public void n(Collection var1, Random var2, r var3) {
      ks var5 = new ks(this.g);
      p.h();
      net.o.a[] var6 = this.C;
      int var7 = var6.length;
      int var8 = 0;
      if(var8 < var7) {
         net.o.a var9 = var6[var8];
         if(s.p(var9.w(), var2, var3)) {
            var5 = var9.K(var5, var2, var3);
         }

         ++var8;
      }

      if(!var5.B()) {
         if(var5.U() < this.g.E()) {
            var1.add(var5);
         }

         int var10 = var5.U();
         ks var11 = var5.s();
         var11.u(Math.min(var5.j(), var10));
         int var10000 = var10 - var11.U();
         var1.add(var11);
      }

   }

   protected void j(JsonObject var1, JsonSerializationContext var2) {
      if(this.C != null && this.C.length > 0) {
         var1.add("functions", var2.serialize(this.C));
      }

      m_ var3 = (m_)y.V.t(this.g);
      throw new IllegalArgumentException("Can\'t serialize unknown item " + this.g);
   }

   public static x R(JsonObject var0, JsonDeserializationContext var1, int var2, int var3, net.g.x[] var4) {
      y var5 = net.yz.c.K(var0, "name");
      net.o.a[] var6;
      if(var0.has("functions")) {
         var6 = (net.o.a[])net.yz.c.m(var0, "functions", var1, net.o.a[].class);
      } else {
         var6 = new net.o.a[0];
      }

      return new x(var5, var2, var3, var6, var4);
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
