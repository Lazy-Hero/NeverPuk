package net.no;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import net.no.s8;

public class f implements net.n2.k {
   private int Q;
   private int G;
   private int D;
   private byte[] n;
   private List l;
   private boolean g;

   public f() {
   }

   public f(net.l.q var1, int var2) {
      s8.Y();
      this.Q = var1.Q;
      this.G = var1.U;
      this.g = var2 == '\uffff';
      boolean var4 = var1.q().F.A();
      this.n = new byte[this.G(var1, var4, var2)];
      this.D = this.r(new net.n2.h(this.o()), var1, var4, var2);
      this.l = Lists.newArrayList();
      Iterator var5 = var1.i().entrySet().iterator();
      if(var5.hasNext()) {
         Entry var6 = (Entry)var5.next();
         net.u.j var7 = (net.u.j)var6.getKey();
         net.ni.v var8 = (net.ni.v)var6.getValue();
         int var9 = var7.h() >> 4;
         if(this.J() || (var2 & 1 << var9) != 0) {
            net.nj.f var10 = var8.e();
            this.l.add(var10);
         }
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.Q = var1.readInt();
      this.G = var1.readInt();
      this.g = var1.readBoolean();
      this.D = var1.q();
      int var2 = var1.q();
      if(var2 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.n = new byte[var2];
         var1.readBytes(this.n);
         int var3 = var1.q();
         this.l = Lists.newArrayList();

         for(int var4 = 0; var4 < var3; ++var4) {
            this.l.add(var1.A());
         }

      }
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeInt(this.Q);
      var1.writeInt(this.G);
      var1.writeBoolean(this.g);
      var1.a(this.D);
      var1.a(this.n.length);
      var1.writeBytes(this.n);
      var1.a(this.l.size());

      for(net.nj.f var3 : this.l) {
         var1.e(var3);
      }

   }

   public void l(net.x.t var1) {
      var1.e(this);
   }

   public net.n2.h K() {
      return new net.n2.h(Unpooled.wrappedBuffer(this.n));
   }

   private ByteBuf o() {
      ByteBuf var1 = Unpooled.wrappedBuffer(this.n);
      var1.writerIndex(0);
      return var1;
   }

   public int r(net.n2.h var1, net.l.q var2, boolean var3, int var4) {
      int var5 = 0;
      net.ny.f[] var6 = var2.R();
      int var7 = 0;

      for(int var8 = var6.length; var7 < var8; ++var7) {
         net.ny.f var9 = var6[var7];
         if(var9 != net.l.q.E && (!this.J() || !var9.g()) && (var4 & 1 << var7) != 0) {
            var5 |= 1 << var7;
            var9.B().H(var1);
            var1.writeBytes(var9.a().o());
            var1.writeBytes(var9.I().o());
         }
      }

      if(this.J()) {
         var1.writeBytes(var2.O());
      }

      return var5;
   }

   protected int G(net.l.q var1, boolean var2, int var3) {
      int var4 = 0;
      net.ny.f[] var5 = var1.R();
      int var6 = 0;

      for(int var7 = var5.length; var6 < var7; ++var6) {
         net.ny.f var8 = var5[var6];
         if(var8 != net.l.q.E && (!this.J() || !var8.g()) && (var3 & 1 << var6) != 0) {
            var4 = var4 + var8.B().f();
            var4 = var4 + var8.a().o().length;
            var4 = var4 + var8.I().o().length;
         }
      }

      if(this.J()) {
         var4 += var1.O().length;
      }

      return var4;
   }

   public int m() {
      return this.Q;
   }

   public int d() {
      return this.G;
   }

   public int g() {
      return this.D;
   }

   public boolean J() {
      return this.g;
   }

   public List N() {
      return this.l;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
