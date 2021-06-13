package net.no;

import java.io.IOException;

public class a implements net.n2.k {
   private int O;
   private net.u.j h;
   private int N;
   private boolean W;

   public a() {
   }

   public a(int var1, net.u.j var2, int var3, boolean var4) {
      this.O = var1;
      this.h = var2;
      this.N = var3;
      this.W = var4;
   }

   public void E(net.n2.h var1) throws IOException {
      this.O = var1.readInt();
      this.h = var1.S();
      this.N = var1.readInt();
      this.W = var1.readBoolean();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeInt(this.O);
      var1.B(this.h);
      var1.writeInt(this.N);
      var1.writeBoolean(this.W);
   }

   public void l(net.x.t var1) {
      var1.e(this);
   }

   public boolean M() {
      return this.W;
   }

   public int W() {
      return this.O;
   }

   public int J() {
      return this.N;
   }

   public net.u.j J() {
      return this.h;
   }
}
