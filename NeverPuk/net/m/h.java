package net.m;

import java.io.IOException;
import net.yz.aa;

public class h implements net.n2.k {
   private String m;
   private int L;
   private net.r.r I;
   private boolean S;
   private int g;
   private aa J;

   public h() {
   }

   public h(String var1, int var2, net.r.r var3, boolean var4, int var5, aa var6) {
      this.m = var1;
      this.L = var2;
      this.I = var3;
      this.S = var4;
      this.g = var5;
      this.J = var6;
   }

   public void E(net.n2.h var1) throws IOException {
      this.m = var1.Z(16);
      this.L = var1.readByte();
      this.I = (net.r.r)var1.S(net.r.r.class);
      this.S = var1.readBoolean();
      this.g = var1.readUnsignedByte();
      this.J = (aa)var1.S(aa.class);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.m);
      var1.writeByte(this.L);
      var1.A(this.I);
      var1.writeBoolean(this.S);
      var1.writeByte(this.g);
      var1.A(this.J);
   }

   public void D(net.x.x var1) {
      var1.Y(this);
   }

   public String j() {
      return this.m;
   }

   public net.r.r Q() {
      return this.I;
   }

   public boolean P() {
      return this.S;
   }

   public int z() {
      return this.g;
   }

   public aa k() {
      return this.J;
   }
}
