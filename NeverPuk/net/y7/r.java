package net.y7;

import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.ne.l;
import net.y7.p;
import net.y7.t;
import net.yv.d;

public class r {
   private final float X;
   private final d W;
   private final t y;
   @Nullable
   private final l s;
   @Nullable
   private final net.r.r U;
   @Nullable
   private final net.yz.z g;
   private final Set Y = Sets.newLinkedHashSet();

   public r(float var1, d var2, t var3, @Nullable l var4, @Nullable net.r.r var5, @Nullable net.yz.z var6) {
      this.X = var1;
      this.W = var2;
      this.y = var3;
      this.s = var4;
      this.U = var5;
      this.g = var6;
   }

   @Nullable
   public l a() {
      return this.s;
   }

   @Nullable
   public l Q() {
      return this.U;
   }

   @Nullable
   public l i() {
      int[] var1 = p.h();
      return this.g == null?null:this.g.v();
   }

   public boolean a(net.y7.z var1) {
      return this.Y.add(var1);
   }

   public void N(net.y7.z var1) {
      this.Y.remove(var1);
   }

   public t V() {
      return this.y;
   }

   public float O() {
      return this.X;
   }

   @Nullable
   public l u(r.h var1) {
      switch(null.G[var1.ordinal()]) {
      case 1:
         return this.a();
      case 2:
         return this.i();
      case 3:
         return this.Q();
      default:
         return null;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class g {
      private final d K;
      private float D;
      private l A;
      private net.r.r w;
      private net.yz.z q;

      public g(d var1) {
         this.K = var1;
      }

      public r.g v(float var1) {
         this.D = var1;
         return this;
      }

      public r.g n(l var1) {
         this.A = var1;
         return this;
      }

      public r.g M(net.r.r var1) {
         this.w = var1;
         return this;
      }

      public r.g F(net.yz.z var1) {
         this.q = var1;
         return this;
      }

      public r w() {
         return new r(this.D, this.K, this.K.o(), this.A, this.w, this.q);
      }
   }

   public static enum h {
      THIS("this"),
      KILLER("killer"),
      KILLER_PLAYER("killer_player");

      private final String T;

      private h(String var3) {
         this.T = var3;
      }

      public static r.h d(String var0) {
         r.h[] var2 = values();
         p.h();
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            r.h var5 = var2[var4];
            if(var5.T.equals(var0)) {
               return var5;
            }

            ++var4;
         }

         throw new IllegalArgumentException("Invalid entity target " + var0);
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }

      public static class t extends TypeAdapter {
         public void U(JsonWriter var1, r.h var2) throws IOException {
            var1.value(var2.T);
         }

         public r.h n(JsonReader var1) throws IOException {
            return r.h.d(var1.nextString());
         }
      }
   }
}
