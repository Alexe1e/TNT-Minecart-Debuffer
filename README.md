# TNT Minecart Nerf

Fabric-Mod für Minecraft Java **26.3**: TNT-Loren explodieren mit **30 % weniger Radius** (Faktor 0,7).

- Nur auf dem **Server** nötig (Fabric-Server mit Geyser/Floodgate: Bedrock- und Java-Spieler brauchen nichts zu installieren).
- Fabric API wird **nicht** benötigt.
- Faktor ändern: `TNT_NERF_FACTOR` in `src/main/java/dev/tntnerf/mixin/MinecartTntMixin.java`.

## JAR über GitHub bauen

1. Neues GitHub-Repository anlegen und alle Dateien hochladen (Branch `main`).
2. Tab **Actions** → Workflow **build** läuft automatisch.
3. Fertige JAR: im Lauf unter **Artifacts** → `tnt-minecart-nerf` (ZIP, darin die `.jar`).
4. Optional Release: Tag `v1.0.0` pushen → JAR hängt automatisch am Release.

Die JAR (ohne `-sources`) in den `mods`-Ordner des Servers legen.
