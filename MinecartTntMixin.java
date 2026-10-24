package dev.tntnerf.mixin;

import net.minecraft.world.entity.vehicle.minecart.MinecartTNT;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

/**
 * Schwaecht TNT-Loren ab: Der Explosionsradius, den die Lore an Level#explode
 * uebergibt, wird um 30 % reduziert (Faktor 0,7).
 */
@Mixin(MinecartTNT.class)
public abstract class MinecartTntMixin {

	/** 0.70 = 30 % schwaecher. Hier aendern, falls du einen anderen Wert willst. */
	@org.spongepowered.asm.mixin.Unique
	private static final float TNT_NERF_FACTOR = 0.7F;

	// Level#explode(Entity, DamageSource, ExplosionDamageCalculator, x, y, z, radius, fire, interaction, ...)
	// Index 6 = radius (float)
	@ModifyArg(
		method = "explode",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;explode"),
		index = 6
	)
	private float tntnerf$scaleRadius(float radius) {
		return radius * TNT_NERF_FACTOR;
	}
}
