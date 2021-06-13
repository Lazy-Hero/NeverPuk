package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import javax.annotation.Nullable;
import net.za;
import net.zk;
import net.cb.t;
import net.n0.ks;
import net.n0.y;
import net.n2.h;
import net.u.d;
import net.yz.c;

public class g4 {
   private final t Q;
   private final t w;
   private final ks o;
   private final net.yz.m_ M;
   private final za G;
   private final boolean a;
   private final boolean s;
   private final boolean N;
   private float L;
   private float H;

   public g4(ks var1, t var2, t var3, @Nullable net.yz.m_ var4, za var5, boolean var6, boolean var7, boolean var8) {
      this.Q = var2;
      this.w = var3;
      this.o = var1;
      this.M = var4;
      this.G = var5;
      this.a = var6;
      this.s = var7;
      this.N = var8;
   }

   public void K(float var1, float var2) {
      this.L = var1;
      this.H = var2;
   }

   public t s() {
      return this.Q;
   }

   public t j() {
      return this.w;
   }

   public ks C() {
      return this.o;
   }

   @Nullable
   public net.yz.m_ W() {
      return this.M;
   }

   public za m() {
      return this.G;
   }

   public float o() {
      return this.L;
   }

   public float g() {
      return this.H;
   }

   public boolean J() {
      return this.a;
   }

   public boolean g() {
      return this.s;
   }

   public boolean s() {
      return this.N;
   }

   public static g4 S(JsonObject var0, JsonDeserializationContext var1) {
      zk.l.p();
      t var3 = (t)c.m(var0, "title", var1, t.class);
      t var4 = (t)c.m(var0, "description", var1, t.class);
      if(var3 != null && var4 != null) {
         ks var5 = W(c.b(var0, "icon"));
         net.yz.m_ var6 = var0.has("background")?new net.yz.m_(c.X(var0, "background")):null;
         za var7 = var0.has("frame")?za.M(c.X(var0, "frame")):za.TASK;
         boolean var8 = c.a(var0, "show_toast", true);
         boolean var9 = c.a(var0, "announce_to_chat", true);
         boolean var10 = c.a(var0, "hidden", false);
         g4 var10000 = new g4(var5, var3, var4, var6, var7, var8, var9, var10);
         if(d.y() == null) {
            zk.l.D(false);
         }

         return var10000;
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static ks W(JsonObject var0) {
      if(!var0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add \'item\' key)");
      } else {
         y var1 = c.K(var0, "item");
         int var2 = c.t(var0, "data", 0);
         return new ks(var1, 1, var2);
      }
   }

   public void u(h var1) {
      var1.p(this.Q);
      var1.p(this.w);
      var1.D(this.o);
      var1.A(this.G);
      int var2 = 0;
      if(this.M != null) {
         var2 |= 1;
      }

      if(this.a) {
         var2 |= 2;
      }

      if(this.N) {
         var2 |= 4;
      }

      var1.writeInt(var2);
      if(this.M != null) {
         var1.Q(this.M);
      }

      var1.writeFloat(this.L);
      var1.writeFloat(this.H);
   }

   public static g4 V(h var0) throws IOException {
      t var2 = var0.g();
      t var3 = var0.g();
      zk.l.p();
      ks var4 = var0.C();
      za var5 = (za)var0.S(za.class);
      int var6 = var0.readInt();
      net.yz.m_ var7 = (var6 & 1) != 0?var0.z():null;
      boolean var8 = (var6 & 2) != 0;
      boolean var9 = (var6 & 4) != 0;
      g4 var10 = new g4(var4, var2, var3, var7, var5, var8, false, var9);
      var10.K(var0.readFloat(), var0.readFloat());
      return var10;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
