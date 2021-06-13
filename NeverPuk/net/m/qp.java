package net.m;

import java.io.IOException;
import net.m.qo;

public class qp implements net.n2.k {
   private qp.v p;
   private net.cr.s s;
   private boolean b;
   private boolean x;

   public qp() {
   }

   public qp(net.cr.s var1) {
      this.p = qp.v.SHOWN;
      this.s = var1;
   }

   public qp(boolean var1, boolean var2) {
      this.p = qp.v.SETTINGS;
      this.b = var1;
      this.x = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      qo.y();
      this.p = (qp.v)var1.S(qp.v.class);
      if(this.p == qp.v.SHOWN) {
         this.s = net.cr.n.E(var1.readInt());
      }

      if(this.p == qp.v.SETTINGS) {
         this.b = var1.readBoolean();
         this.x = var1.readBoolean();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.A(this.p);
      if(this.p == qp.v.SHOWN) {
         var1.writeInt(net.cr.n.x(this.s));
      } else if(this.p == qp.v.SETTINGS) {
         var1.writeBoolean(this.b);
         var1.writeBoolean(this.x);
      }

   }

   public void V(net.x.x var1) {
      var1.L(this);
   }

   public qp.v f() {
      return this.p;
   }

   public net.cr.s g() {
      return this.s;
   }

   public boolean v() {
      return this.b;
   }

   public boolean f() {
      return this.x;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   public static enum v {
      SHOWN,
      SETTINGS;
   }
}
