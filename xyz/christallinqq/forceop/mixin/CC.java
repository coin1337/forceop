package xyz.christallinqq.forceop.mixin;

import java.util.Random;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_746.class})
public class CC {
   @Inject(
      method = {"sendChatMessage"},
      cancellable = true,
      at = {@At("HEAD")}
   )
   public void sCM(String message, CallbackInfo ci) {
      if (message.toLowerCase().startsWith("foe>")) {
         ci.cancel();
         String m = message.substring(4);
         String[] a = m.split(" +");
         String c = a[0].toLowerCase();
         byte var7 = -1;
         switch(c.hashCode()) {
         case 3417913:
            if (c.equals("opme")) {
               var7 = 0;
            }
         default:
            switch(var7) {
            case 0:
               class_310.method_1551().field_1724.method_7353(class_2561.method_30163("Working on it..."), false);
               (new Thread(() -> {
                  int progress = 0;

                  while(progress < 41) {
                     if ((new Random()).nextBoolean()) {
                        ++progress;
                     }

                     StringBuilder progressS = new StringBuilder();
                     StringBuilder padding = new StringBuilder();

                     int i;
                     for(i = 0; i < progress; ++i) {
                        progressS.append("=");
                     }

                     for(i = 0; i < Math.abs(progress - 40); ++i) {
                        padding.append(" ");
                     }

                     class_310.method_1551().field_1724.method_7353(class_2561.method_30163(class_124.field_1075 + "[" + class_124.field_1078 + progressS.toString() + padding.toString() + class_124.field_1075 + "]"), true);

                     try {
                        Thread.sleep(60L);
                     } catch (Exception var4) {
                     }
                  }

                  class_310.method_1551().field_1724.method_7353(class_2561.method_30163(class_124.field_1080 + "" + class_124.field_1056 + "[Server: Made " + class_310.method_1551().field_1724.method_5477().method_10851() + " a server operator]"), false);
               })).start();
               break;
            default:
               class_310.method_1551().field_1724.method_7353(class_2561.method_30163("Man idk that command doesnt seem to exist. Try opme"), false);
            }
         }
      }

   }
}
