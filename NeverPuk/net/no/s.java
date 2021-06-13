package net.no;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.no.s8;

public class s implements net.n2.k {
   private int n;
   private final List G = Lists.newArrayList();

   public s() {
   }

   public s(int var1, Collection var2) {
      this.n = var1;

      for(net.s.i var4 : var2) {
         this.G.add(new s.i(var4.M().K(), var4.J(), var4.s()));
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.n = var1.q();
      int var2 = var1.readInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1.Z(64);
         double var5 = var1.readDouble();
         ArrayList var7 = Lists.newArrayList();
         int var8 = var1.q();

         for(int var9 = 0; var9 < var8; ++var9) {
            UUID var10 = var1.J();
            var7.add(new net.s.k(var10, "Unknown synced attribute modifier", var1.readDouble(), var1.readByte()));
         }

         this.G.add(new s.i(var4, var5, var7));
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.Y();
      var1.a(this.n);
      var1.writeInt(this.G.size());
      Iterator var3 = this.G.iterator();
      if(var3.hasNext()) {
         s.i var4 = (s.i)var3.next();
         var1.R(var4.e());
         var1.writeDouble(var4.X());
         var1.a(var4.O().size());
         Iterator var5 = var4.O().iterator();
         if(var5.hasNext()) {
            net.s.k var6 = (net.s.k)var5.next();
            var1.l(var6.s());
            var1.writeDouble(var6.e());
            var1.writeByte(var6.X());
         }
      }

   }

   public void g(net.x.t var1) {
      var1.g(this);
   }

   public int v() {
      return this.n;
   }

   public List v() {
      return this.G;
   }

   public class i {
      private final String Y;
      private final double L;
      private final Collection G;

      public i(String var2, double var3, Collection var5) {
         this.Y = var2;
         this.L = var3;
         this.G = var5;
      }

      public String e() {
         return this.Y;
      }

      public double X() {
         return this.L;
      }

      public Collection O() {
         return this.G;
      }
   }
}
