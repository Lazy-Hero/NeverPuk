package net.no;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import net.no.s8;

public class ik implements net.n2.k {
   private String O = "";
   private String E = "";
   private String l = "";
   private String J = "";
   private String p;
   private String I;
   private int R;
   private final Collection B;
   private int v;
   private int K;

   public ik() {
      this.p = net.nc.m.ALWAYS.internalName;
      this.I = net.nc.m.ALWAYS.name;
      this.R = -1;
      this.B = Lists.newArrayList();
   }

   public ik(net.nc.y var1, int var2) {
      this.p = net.nc.m.ALWAYS.internalName;
      this.I = net.nc.m.ALWAYS.name;
      this.R = -1;
      this.B = Lists.newArrayList();
      this.O = var1.D();
      this.v = var2;
      if(var2 == 2) {
         this.E = var1.a();
         this.l = var1.G();
         this.J = var1.I();
         this.K = var1.F();
         this.p = var1.q().internalName;
         this.I = var1.U().name;
         this.R = var1.b().c();
      }

      this.B.addAll(var1.Q());
   }

   public ik(net.nc.y var1, Collection var2, int var3) {
      this.p = net.nc.m.ALWAYS.internalName;
      this.I = net.nc.m.ALWAYS.name;
      this.R = -1;
      this.B = Lists.newArrayList();
      if(var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if(!var2.isEmpty()) {
         this.v = var3;
         this.O = var1.D();
         this.B.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   public void E(net.n2.h var1) throws IOException {
      this.O = var1.Z(16);
      this.v = var1.readByte();
      if(this.v == 0 || this.v == 2) {
         this.E = var1.Z(32);
         this.l = var1.Z(16);
         this.J = var1.Z(16);
         this.K = var1.readByte();
         this.p = var1.Z(32);
         this.I = var1.Z(32);
         this.R = var1.readByte();
      }

      if(this.v == 0 || this.v == 3 || this.v == 4) {
         int var2 = var1.q();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.B.add(var1.Z(40));
         }
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.Y();
      var1.R(this.O);
      var1.writeByte(this.v);
      if(this.v == 0 || this.v == 2) {
         var1.R(this.E);
         var1.R(this.l);
         var1.R(this.J);
         var1.writeByte(this.K);
         var1.R(this.p);
         var1.R(this.I);
         var1.writeByte(this.R);
      }

      if(this.v == 0 || this.v == 3 || this.v == 4) {
         var1.a(this.B.size());
         Iterator var3 = this.B.iterator();
         if(var3.hasNext()) {
            String var4 = (String)var3.next();
            var1.R(var4);
         }
      }

   }

   public void z(net.x.t var1) {
      var1.y(this);
   }

   public String Z() {
      return this.O;
   }

   public String W() {
      return this.E;
   }

   public String u() {
      return this.l;
   }

   public String h() {
      return this.J;
   }

   public Collection L() {
      return this.B;
   }

   public int u() {
      return this.v;
   }

   public int Y() {
      return this.K;
   }

   public int d() {
      return this.R;
   }

   public String y() {
      return this.p;
   }

   public String A() {
      return this.I;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
