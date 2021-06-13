package net.no;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.no.s8;
import net.yv.o9;

public class s3 implements net.n2.k {
   private s3.n I;
   private final List B = Lists.newArrayList();

   public s3() {
   }

   public s3(s3.n var1, net.r.h... var2) {
      this.I = var1;

      for(net.r.h var6 : var2) {
         this.B.add(new s3.w(var6.e(), var6.t7, var6.tA.V(), var6.H()));
      }

   }

   public s3(s3.n var1, Iterable var2) {
      this.I = var1;

      for(net.r.h var4 : var2) {
         this.B.add(new s3.w(var4.e(), var4.t7, var4.tA.V(), var4.H()));
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.I = (s3.n)var1.S(s3.n.class);
      int var2 = var1.q();

      for(int var3 = 0; var3 < var2; ++var3) {
         GameProfile var4 = null;
         int var5 = 0;
         o9 var6 = null;
         net.cb.t var7 = null;
         switch(null.k[this.I.ordinal()]) {
         case 1:
            var4 = new GameProfile(var1.J(), var1.Z(16));
            int var8 = var1.q();
            int var9 = 0;

            for(; var9 < var8; ++var9) {
               String var10 = var1.Z(32767);
               String var11 = var1.Z(32767);
               if(var1.readBoolean()) {
                  var4.getProperties().put(var10, new Property(var10, var11, var1.Z(32767)));
               } else {
                  var4.getProperties().put(var10, new Property(var10, var11));
               }
            }

            var6 = o9.M(var1.q());
            var5 = var1.q();
            if(var1.readBoolean()) {
               var7 = var1.g();
            }
            break;
         case 2:
            var4 = new GameProfile(var1.J(), (String)null);
            var6 = o9.M(var1.q());
            break;
         case 3:
            var4 = new GameProfile(var1.J(), (String)null);
            var5 = var1.q();
            break;
         case 4:
            var4 = new GameProfile(var1.J(), (String)null);
            if(var1.readBoolean()) {
               var7 = var1.g();
            }
            break;
         case 5:
            var4 = new GameProfile(var1.J(), (String)null);
         }

         this.B.add(new s3.w(var4, var5, var6, var7));
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.A(this.I);
      s8.Y();
      var1.a(this.B.size());
      Iterator var3 = this.B.iterator();
      if(var3.hasNext()) {
         s3.w var4 = (s3.w)var3.next();
         switch(null.k[this.I.ordinal()]) {
         case 1:
            var1.l(var4.o().getId());
            var1.R(var4.o().getName());
            var1.a(var4.o().getProperties().size());
            Iterator var5 = var4.o().getProperties().values().iterator();
            if(var5.hasNext()) {
               Property var6 = (Property)var5.next();
               var1.R(var6.getName());
               var1.R(var6.getValue());
               if(var6.hasSignature()) {
                  var1.writeBoolean(true);
                  var1.R(var6.getSignature());
               }

               var1.writeBoolean(false);
            }

            var1.a(var4.n().x());
            var1.a(var4.Y());
            if(var4.b() == null) {
               var1.writeBoolean(false);
            }

            var1.writeBoolean(true);
            var1.p(var4.b());
         case 2:
            var1.l(var4.o().getId());
            var1.a(var4.n().x());
         case 3:
            var1.l(var4.o().getId());
            var1.a(var4.Y());
         case 4:
            var1.l(var4.o().getId());
            if(var4.b() == null) {
               var1.writeBoolean(false);
            }

            var1.writeBoolean(true);
            var1.p(var4.b());
         case 5:
            var1.l(var4.o().getId());
         }
      }

   }

   public void m(net.x.t var1) {
      var1.Y(this);
   }

   public List m() {
      return this.B;
   }

   public s3.n G() {
      return this.I;
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("action", this.I).add("entries", this.B).toString();
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   public static enum n {
      ADD_PLAYER,
      UPDATE_GAME_MODE,
      UPDATE_LATENCY,
      UPDATE_DISPLAY_NAME,
      REMOVE_PLAYER;
   }

   public class w {
      private final int j;
      private final o9 L;
      private final GameProfile x;
      private final net.cb.t O;

      public w(GameProfile var2, int var3, o9 var4, @Nullable net.cb.t var5) {
         this.x = var2;
         this.j = var3;
         this.L = var4;
         this.O = var5;
      }

      public GameProfile o() {
         return this.x;
      }

      public int Y() {
         return this.j;
      }

      public o9 n() {
         return this.L;
      }

      @Nullable
      public net.cb.t b() {
         return this.O;
      }

      public String toString() {
         int var1 = s8.x();
         return MoreObjects.toStringHelper(this).add("latency", this.j).add("gameMode", this.L).add("profile", this.x).add("displayName", this.O == null?null:net.cb.t.m(this.O)).toString();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
