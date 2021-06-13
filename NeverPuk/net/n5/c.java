package net.n5;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.primitives.Doubles;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import net.n5.g;
import net.n5.i;
import net.n5.m;
import net.n5.o;
import net.n5.y;
import net.u.d;
import net.y.b;
import net.y.f;
import net.y.p;
import net.y.ui;
import net.yz.ac;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class c {
   private static final Logger I = LogManager.getLogger();
   private static final ThreadFactory s = (new ThreadFactoryBuilder()).setNameFormat("Chunk Batcher %d").setDaemon(true).build();
   private final int i;
   private final List w;
   private final List Z;
   private final PriorityBlockingQueue Y;
   private final BlockingQueue g;
   private final f q;
   private final net.y.y t;
   private final Queue n;
   private final y e;

   public c() {
      this(-1);
   }

   public c(int var1) {
      m.t();
      this.w = Lists.newArrayList();
      this.Z = Lists.newArrayList();
      this.Y = Queues.newPriorityBlockingQueue();
      this.q = new f();
      this.t = new net.y.y();
      this.n = Queues.newPriorityQueue();
      int var3 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3D) / 10485760);
      int var4 = Math.max(1, net.u.t.g(Runtime.getRuntime().availableProcessors(), 1, var3 / 5));
      this.i = net.u.t.g(var4, 1, var3);
      d.h(new d[1]);
      this.i = var1;
      if(var4 > 1) {
         int var5 = 0;
         if(var5 < var4) {
            y var6 = new y(this);
            Thread var7 = s.newThread(var6);
            var7.start();
            this.Z.add(var6);
            this.w.add(var7);
            ++var5;
         }
      }

      this.g = Queues.newArrayBlockingQueue(this.i);
      int var9 = 0;
      if(var9 < this.i) {
         this.g.add(new b());
         ++var9;
      }

      this.e = new y(this, new b());
   }

   public String M() {
      return this.w.isEmpty()?String.format("pC: %03d, single-threaded", new Object[]{Integer.valueOf(this.Y.size())}):String.format("pC: %03d, pU: %1d, aB: %1d", new Object[]{Integer.valueOf(this.Y.size()), Integer.valueOf(this.n.size()), Integer.valueOf(this.g.size())});
   }

   public boolean k(long var1) {
      boolean var3 = false;

      while(true) {
         boolean var4 = false;
         if(this.w.isEmpty()) {
            i var5 = (i)this.Y.poll();
            this.e.k(var5);
            var4 = true;
         }

         Queue var10 = this.n;
         if(!this.n.isEmpty()) {
            ((c.g)this.n.poll()).Q.run();
            var4 = true;
            var3 = true;
         }

         if(var1 == 0L || var1 < System.nanoTime()) {
            break;
         }
      }

      return var3;
   }

   public boolean M(m var1) {
      var1.y().lock();
      final i var3 = var1.H();
      var3.M(new Runnable() {
         public void run() {
            c.this.Y.remove(var3);
         }
      });
      boolean var4 = this.Y.offer(var3);
      var3.v();
      var1.y().unlock();
      return var4;
   }

   public boolean l(m var1) {
      var1.y().lock();
      i var3 = var1.H();
      this.e.k(var3);
      boolean var2 = true;
      var1.y().unlock();
      return var2;
   }

   public void R() {
      this.E();
      ArrayList var1 = Lists.newArrayList();

      while(var1.size() != this.i) {
         this.k(Long.MAX_VALUE);
         var1.add(this.s());
      }

      this.g.addAll(var1);
   }

   public void i(b var1) {
      this.g.add(var1);
   }

   public b s() throws InterruptedException {
      return (b)this.g.take();
   }

   public i E() throws InterruptedException {
      return (i)this.Y.take();
   }

   public boolean E(m var1) {
      var1.y().lock();
      final i var3 = var1.J();
      var3.M(new Runnable() {
         public void run() {
            c.this.Y.remove(var3);
         }
      });
      boolean var4 = this.Y.offer(var3);
      var1.y().unlock();
      return var4;
   }

   public ListenableFuture E(final ac var1, final p var2, final m var3, final g var4, final double var5) {
      if(net.nn.j.b().R()) {
         if(ui.H()) {
            this.P(var2, var3.X(var1.ordinal()));
         } else {
            this.W(var2, ((o)var3).H(var1, var4), var3);
         }

         var2.S(0.0D, 0.0D, 0.0D);
         return Futures.immediateFuture((Object)null);
      } else {
         ListenableFutureTask var7 = ListenableFutureTask.create(new Runnable() {
            public void run() {
               c.this.E(var1, var2, var3, var4, var5);
            }
         }, (Object)null);
         Queue var8 = this.n;
         this.n.add(new c.g(var7, var5));
         return var7;
      }
   }

   private void W(p var1, int var2, m var3) {
      net.y.d.b(var2, 4864);
      net.y.d.c();
      var3.p();
      this.q.s(var1);
      net.y.d.Y();
      net.y.d.q();
   }

   private void P(p var1, net.y8.g var2) {
      this.t.t(var2);
      this.t.s(var1);
   }

   public void E() {
      while(!this.Y.isEmpty()) {
         i var1 = (i)this.Y.poll();
         var1.v();
      }

   }

   public boolean J() {
      return this.Y.isEmpty() && this.n.isEmpty();
   }

   public void P() {
      this.E();

      for(y var2 : this.Z) {
         var2.f();
      }

      for(Thread var5 : this.w) {
         var5.interrupt();
         var5.join();
      }

      this.g.clear();
   }

   public boolean a() {
      return this.g.isEmpty();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class g implements Comparable {
      private final ListenableFutureTask Q;
      private final double K;

      public g(ListenableFutureTask var2, double var3) {
         this.Q = var2;
         this.K = var3;
      }

      public int l(c.g var1) {
         return Doubles.compare(this.K, var1.K);
      }
   }
}
