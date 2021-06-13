package net.no;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class e implements net.n2.k {
   private int u;
   private UUID L;
   private double z;
   private double c;
   private double M;
   private byte q;
   private byte Q;
   private net.k.n m;
   private List R;

   public e() {
   }

   public e(net.r.r var1) {
      this.u = var1.G();
      this.L = var1.e().getId();
      this.z = var1.b;
      this.c = var1.hS;
      this.M = var1.hr;
      this.q = (byte)((int)(var1.hN * 256.0F / 360.0F));
      this.Q = (byte)((int)(var1.V * 256.0F / 360.0F));
      this.m = var1.A();
   }

   public void E(net.n2.h var1) throws IOException {
      this.u = var1.q();
      this.L = var1.J();
      this.z = var1.readDouble();
      this.c = var1.readDouble();
      this.M = var1.readDouble();
      this.q = var1.readByte();
      this.Q = var1.readByte();
      this.R = net.k.n.s(var1);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.u);
      var1.l(this.L);
      var1.writeDouble(this.z);
      var1.writeDouble(this.c);
      var1.writeDouble(this.M);
      var1.writeByte(this.q);
      var1.writeByte(this.Q);
      this.m.l(var1);
   }

   public void m(net.x.t var1) {
      var1.V(this);
   }

   @Nullable
   public List R() {
      return this.R;
   }

   public int c() {
      return this.u;
   }

   public UUID M() {
      return this.L;
   }

   public double R() {
      return this.z;
   }

   public double a() {
      return this.c;
   }

   public double V() {
      return this.M;
   }

   public byte X() {
      return this.q;
   }

   public byte j() {
      return this.Q;
   }
}
