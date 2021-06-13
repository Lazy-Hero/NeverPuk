package net.nq;

import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Nullable;
import net.n0.ks;
import net.n2.h;
import net.nj.e;
import net.nj.f;
import net.nq.x;

public class z extends ArrayList {
   public z() {
   }

   public z(f var1) {
      this.t(var1);
   }

   @Nullable
   public x v(ks var1, ks var2, int var3) {
      int[] var4 = x.R();
      if(var3 > 0 && var3 < this.size()) {
         x var8 = (x)this.get(var3);
         return this.j(var1, var8.K()) && (var2.B() && !var8.m() || var8.m() && this.j(var2, var8.z())) && var1.U() >= var8.K().U() && (!var8.m() || var2.U() >= var8.z().U())?var8:null;
      } else {
         int var5 = 0;
         if(var5 < this.size()) {
            x var6 = (x)this.get(var5);
            if(this.j(var1, var6.K()) && var1.U() >= var6.K().U() && (!var6.m() && var2.B() || var6.m() && this.j(var2, var6.z()) && var2.U() >= var6.z().U())) {
               return var6;
            }

            ++var5;
         }

         return null;
      }
   }

   private boolean j(ks var1, ks var2) {
      return ks.K(var1, var2) && (!var2.D() || var1.D() && e.v(var2.o(), var1.o(), false));
   }

   public void M(h var1) {
      var1.writeByte((byte)(this.size() & 255));

      for(int var2 = 0; var2 < this.size(); ++var2) {
         x var3 = (x)this.get(var2);
         var1.D(var3.K());
         var1.D(var3.f());
         ks var4 = var3.z();
         var1.writeBoolean(!var4.B());
         if(!var4.B()) {
            var1.D(var4);
         }

         var1.writeBoolean(var3.y());
         var1.writeInt(var3.V());
         var1.writeInt(var3.Y());
      }

   }

   public static net.nq.z V(h var0) throws IOException {
      net.nq.z var1 = new net.nq.z();
      int var2 = var0.readByte() & 255;

      for(int var3 = 0; var3 < var2; ++var3) {
         ks var4 = var0.C();
         ks var5 = var0.C();
         ks var6 = ks.a;
         if(var0.readBoolean()) {
            var6 = var0.C();
         }

         boolean var7 = var0.readBoolean();
         int var8 = var0.readInt();
         int var9 = var0.readInt();
         x var10 = new x(var4, var6, var5, var8, var9);
         var10.y();
         var1.add(var10);
      }

      return var1;
   }

   public void t(f var1) {
      net.nj.h var2 = var1.A("Recipes", 10);

      for(int var3 = 0; var3 < var2.z(); ++var3) {
         f var4 = var2.i(var3);
         this.add(new x(var4));
      }

   }

   public f s() {
      f var1 = new f();
      net.nj.h var2 = new net.nj.h();

      for(int var3 = 0; var3 < this.size(); ++var3) {
         x var4 = (x)this.get(var3);
         var2.m(var4.L());
      }

      var1.K("Recipes", var2);
      return var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
