package net.no;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.n0.ks;
import net.no.s8;

public class i5 implements net.n2.k {
   private int z;
   private List n;

   public i5() {
   }

   public i5(int var1, net.yz.w var2) {
      s8.x();
      super();
      this.z = var1;
      this.n = net.yz.w.C(var2.size(), ks.a);
      int var4 = 0;
      if(var4 < this.n.size()) {
         ks var5 = (ks)var2.get(var4);
         this.n.set(var4, var5.s());
         ++var4;
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.z = var1.readUnsignedByte();
      s8.Y();
      short var3 = var1.readShort();
      this.n = net.yz.w.C(var3, ks.a);
      int var4 = 0;
      if(var4 < var3) {
         this.n.set(var4, var1.C());
         ++var4;
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.x();
      var1.writeByte(this.z);
      var1.writeShort(this.n.size());
      Iterator var3 = this.n.iterator();
      if(var3.hasNext()) {
         ks var4 = (ks)var3.next();
         var1.D(var4);
      }

   }

   public void c(net.x.t var1) {
      var1.B(this);
   }

   public int u() {
      return this.z;
   }

   public List b() {
      return this.n;
   }
}
