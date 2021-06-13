package net.n5;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.annotation.Nullable;
import net.d.w;
import net.n5.c;
import net.n5.g;
import net.n5.i;
import net.n5.m;
import net.y.b;
import net.yv.r;
import net.yz.ac;
import net.yz.aq;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y implements Runnable {
   private static final Logger o = LogManager.getLogger();
   private final c z;
   private final b D;
   private boolean f;

   public y(c var1) {
      this(var1, (b)null);
   }

   public y(c var1, @Nullable b var2) {
      this.f = true;
      this.z = var1;
      this.D = var2;
   }

   public void run() {
      while(this.f) {
         this.k(this.z.E());
      }

   }

   protected void k(final i var1) throws InterruptedException {
      m.t();
      var1.B().lock();
      if(var1.C() != i.a.PENDING) {
         if(!var1.K()) {
            o.warn("Chunk render task was {} when I expected it to be pending; ignoring task", var1.C());
         }

         var1.B().unlock();
      } else {
         net.u.j var3 = new net.u.j(net.nn.j.b().sf);
         net.u.j var4 = var1.D().u();
         boolean var5 = true;
         boolean var6 = true;
         boolean var7 = true;
         if(var4.F(8, 8, 8).n(var3) > 576.0D) {
            r var8 = var1.D().d();
            net.u.j var9 = new net.u.j(var4);
            if(!this.A(var9.V(var4).j(aq.WEST, 16), var8) || !this.A(var9.V(var4).j(aq.NORTH, 16), var8) || !this.A(var9.V(var4).j(aq.EAST, 16), var8) || !this.A(var9.V(var4).j(aq.SOUTH, 16), var8)) {
               var1.B().unlock();
               return;
            }
         }

         var1.a(i.a.COMPILING);
         var1.B().unlock();
         net.ne.l var14 = net.nn.j.b().A();
         if(var14 == null) {
            var1.v();
         }

         var1.g(this.c());
         float var15 = (float)var14.b;
         float var16 = (float)var14.hS + var14.A();
         float var17 = (float)var14.hr;
         i.f var18 = var1.Y();
         if(var18 == i.f.REBUILD_CHUNK) {
            var1.D().Q(var15, var16, var17, var1);
         }

         if(var18 == i.f.RESORT_TRANSPARENCY) {
            var1.D().A(var15, var16, var17, var1);
         }

         var1.B().lock();
         if(var1.C() != i.a.COMPILING) {
            if(!var1.K()) {
               o.warn("Chunk render task was {} when I expected it to be compiling; aborting task", var1.C());
            }

            this.q(var1);
            var1.B().unlock();
         } else {
            var1.a(i.a.UPLOADING);
            var1.B().unlock();
            final g var19 = var1.X();
            ArrayList var20 = Lists.newArrayList();
            if(var18 == i.f.REBUILD_CHUNK) {
               ac[] var10 = ac.values();
               int var11 = var10.length;
               int var12 = 0;
               if(var12 < var11) {
                  ac var13 = var10[var12];
                  if(var19.Z(var13)) {
                     var20.add(this.z.E(var13, var1.m().M(var13), var1.D(), var19, var1.I()));
                  }

                  ++var12;
               }
            }

            if(var18 == i.f.RESORT_TRANSPARENCY) {
               var20.add(this.z.E(ac.TRANSLUCENT, var1.m().M(ac.TRANSLUCENT), var1.D(), var19, var1.I()));
            }

            final ListenableFuture var21 = Futures.allAsList(var20);
            var1.M(new Runnable() {
               public void run() {
                  var21.cancel(false);
               }
            });
            Futures.addCallback(var21, new FutureCallback() {
               public void o(@Nullable List var1x) {
                  m.t();
                  y.this.q(var1);
                  var1.B().lock();
                  if(var1.C() != i.a.UPLOADING) {
                     if(!var1.K()) {
                        y.o.warn("Chunk render task was {} when I expected it to be uploading; aborting task", var1.C());
                     }

                     var1.B().unlock();
                  } else {
                     var1.a(i.a.DONE);
                     var1.B().unlock();
                     var1.D().u(var19);
                  }
               }

               public void onFailure(Throwable var1x) {
                  m.t();
                  y.this.q(var1);
                  if(!(var1x instanceof CancellationException) && !(var1x instanceof InterruptedException)) {
                     net.nn.j.b().r(w.m(var1x, "Rendering chunk"));
                  }

               }

               private static CancellationException a(CancellationException var0) {
                  return var0;
               }
            });
         }
      }
   }

   private boolean A(net.u.j var1, r var2) {
      return false;
   }

   private b c() throws InterruptedException {
      return this.D != null?this.D:this.z.s();
   }

   private void q(i var1) {
      if(this.D == null) {
         this.z.i(var1.m());
      }

   }

   public void f() {
      this.f = false;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
