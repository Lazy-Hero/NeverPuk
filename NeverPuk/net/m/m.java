package net.m;

import java.io.IOException;
import net.yz.aq;

public class m implements net.n2.k {
   private net.u.j m;
   private aq w;
   private m.n q;

   public m() {
   }

   public m(m.n var1, net.u.j var2, aq var3) {
      this.q = var1;
      this.m = var2;
      this.w = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.q = (m.n)var1.S(m.n.class);
      this.m = var1.S();
      this.w = aq.l(var1.readUnsignedByte());
   }

   public void O(net.n2.h var1) throws IOException {
      var1.A(this.q);
      var1.B(this.m);
      var1.writeByte(this.w.w());
   }

   public void J(net.x.x var1) {
      var1.U(this);
   }

   public net.u.j h() {
      return this.m;
   }

   public aq k() {
      return this.w;
   }

   public m.n Q() {
      return this.q;
   }

   public static enum n {
      START_DESTROY_BLOCK,
      ABORT_DESTROY_BLOCK,
      STOP_DESTROY_BLOCK,
      DROP_ALL_ITEMS,
      DROP_ITEM,
      RELEASE_USE_ITEM,
      SWAP_HELD_ITEMS;
   }
}
