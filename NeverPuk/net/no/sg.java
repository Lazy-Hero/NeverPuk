package net.no;

import java.io.IOException;
import java.util.UUID;
import net.yz.aq;

public class sg implements net.n2.k {
   private int P;
   private UUID K;
   private net.u.j v;
   private aq B;
   private String W;

   public sg() {
   }

   public sg(net.nm.l var1) {
      this.P = var1.G();
      this.K = var1.O();
      this.v = var1.r();
      this.B = var1.uz;
      this.W = var1.dN.title;
   }

   public void E(net.n2.h var1) throws IOException {
      this.P = var1.q();
      this.K = var1.J();
      this.W = var1.Z(net.nm.l.MAX_NAME_LENGTH);
      this.v = var1.S();
      this.B = aq.Q(var1.readUnsignedByte());
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.P);
      var1.l(this.K);
      var1.R(this.W);
      var1.B(this.v);
      var1.writeByte(this.B.u());
   }

   public void s(net.x.t var1) {
      var1.Q(this);
   }

   public int Y() {
      return this.P;
   }

   public UUID S() {
      return this.K;
   }

   public net.u.j f() {
      return this.v;
   }

   public aq x() {
      return this.B;
   }

   public String f() {
      return this.W;
   }
}
