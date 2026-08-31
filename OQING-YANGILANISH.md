# Qashqar Rubob ijrochiligi — 2026-yil holatiga moslashtirish

Loyiha `versionCode 6` (v1.5) dan `versionCode 7` (v1.6) ga yangilandi va
bugungi Android talablariga (Android 15 / API 35) moslashtirildi.

---

## 1. Nima o'zgardi

### Qurilish sozlamalari (build tizimi)

| Nima | Eski | Yangi |
|---|---|---|
| Android Gradle Plugin | 7.3.1 | 8.6.1 |
| Gradle | 7.4 | 8.7 |
| Kotlin | 1.7.20 | 1.9.24 |
| compileSdk / targetSdk | 32 | 35 (Android 15) |
| minSdk | 21 | 21 (o'zgarmadi) |
| Java | 8 | 17 |
| Navigation | 2.5.3 | 2.7.7 |
| core-ktx | 1.7.0 | 1.13.1 |
| appcompat | 1.5.1 | 1.7.0 |
| material | 1.7.0 | 1.12.0 |

**Muhim:** endi loyihani ochish uchun **JDK 17** kerak. Android Studio'ning
so'nggi versiyalarida u allaqachon bor.

### jcenter() olib tashlandi

JCenter 2021-yilda yopilgan — u yerdan kutubxona yuklab olib bo'lmaydi.
`google()` va `mavenCentral()` qoldirildi. `com.intuit.sdp` / `ssp`
kutubxonalari mavenCentral'da bor, shuning uchun ular ishlaydi.

Yo'l-yo'lakay bitta xato tuzatildi: `sdp-android` versiyasi noto'g'ri
o'zgaruvchidan (`$ssp_version`) olinayotgan edi.

### ExoPlayer 2.8.4 → Media3 1.4.1

Bu eng katta o'zgarish. Eski `com.google.android.exoplayer2` kutubxonasi
2018-yilgi bo'lib, endi qo'llab-quvvatlanmaydi va yangi Android'larda
video ijrosi buzilishi mumkin. AndroidX Media3 ga ko'chirildi:

| Eski API | Yangi API |
|---|---|
| `SimpleExoPlayerView` | `androidx.media3.ui.PlayerView` |
| `ExoPlayerFactory.newSimpleInstance()` | `ExoPlayer.Builder(context).build()` |
| `ExtractorMediaSource` + `prepare(source)` | `setMediaItem(MediaItem.fromUri())` + `prepare()` |
| `Player.DefaultEventListener` + `seekTo(0)` | `repeatMode = REPEAT_MODE_ONE` |

O'zgargan fayllar: `MediatorFragment.kt`, `RulesFragment.kt`,
`fragment_mediator.xml`, `fragment_rules.xml`.

**Qo'shimcha tuzatish:** eski kodda pleyerlar hech qachon `release()`
qilinmasdi — bu xotira sizib chiqishiga (memory leak) olib kelardi.
Endi `onDestroyView()` da barcha pleyerlar bo'shatiladi.

### Android 15 "edge-to-edge" muammosi

targetSdk 35 da Android 15 ilovani majburan to'liq ekranga yoyadi —
kontent status bar va navigatsiya paneli ostida qolib ketadi.

`MainActivity.applyWindowInsets()` funksiyasi qo'shildi: tizim panellari
balandligi root layoutga padding qilib beriladi. Root layout foni
`brown_dark_bg` qilingan, shuning uchun tashqi ko'rinish avvalgidek qoladi.

`window.statusBarColor` API 35 da ishlamay qo'ygani uchun, eski
usuldagi kod olib tashlanib, uning o'rniga tema orqali (eski
Android'lar uchun) va insets orqali (yangilari uchun) hal qilindi.

---

## 2. Fayllarni qo'llash

Ushbu ZIP ichidagi papka tuzilishi loyihangiznikiga aynan mos keladi.
Fayllarni loyiha ildiziga **ustidan nusxalang** (replace).

O'zgargan fayllar ro'yxati:

```
build.gradle
settings.gradle
gradle.properties
gradle/wrapper/gradle-wrapper.properties
app/build.gradle
app/src/main/java/com/raqamlidunyo/qashqarrubob/MainActivity.kt
app/src/main/java/com/raqamlidunyo/qashqarrubob/ui/mediator/MediatorFragment.kt
app/src/main/java/com/raqamlidunyo/qashqarrubob/ui/rules/RulesFragment.kt
app/src/main/res/layout/activity_main.xml
app/src/main/res/layout/fragment_mediator.xml
app/src/main/res/layout/fragment_rules.xml
app/src/main/res/values/themes.xml
app/src/main/res/values-night/themes.xml
.github/workflows/build-apk.yml   (yangi fayl)
```

Qolgan barcha fayllar (audio, video, rasm, boshqa fragmentlar)
o'zgarishsiz qoladi.

---

## 3. APK olishning ikki yo'li

### A) GitHub Actions orqali (kompyuterga hech narsa o'rnatmasdan)

1. Yuqoridagi fayllarni GitHub repongizga yuklang
   (`.github/workflows/build-apk.yml` ni ham unutmang).
2. Repo sahifasida **Actions** bo'limiga o'ting.
3. "APK yig'ish" ishi avtomatik boshlanadi (yoki
   **Run workflow** tugmasi bilan qo'lda ishga tushiring).
4. 5–10 daqiqadan so'ng ish yakunlanadi. Sahifa pastidagi
   **Artifacts** bo'limidan `QashqarRubob-debug-apk` ni yuklab oling.
5. ZIP ichidan APK chiqadi — uni telefoningizga o'rnating.

Birinchi marta xatolik chiqsa, Actions'dagi qizil qadamni bosing va
xato matnini menga yuboring.

### B) Android Studio'da

1. Loyihani oching (Android Studio Ladybug yoki undan yangisi).
2. **File → Sync Project with Gradle Files** — kutubxonalar yuklanadi.
3. **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
4. APK shu yerda: `app/build/outputs/apk/debug/app-debug.apk`.

---

## 4. Imzolash (signing) haqida

Yuqoridagi debug APK telefonlarga o'rnatish uchun yetarli.

Lekin **Play Store**ga yuklash yoki foydalanuvchilarga rasmiy tarqatish
uchun release APK **imzolangan** bo'lishi kerak:

**Android Studio → Build → Generate Signed Bundle / APK → APK →
Create new keystore...**

Keystore faylini va parolini ehtiyot qilib saqlang. Uni yo'qotsangiz,
ilovaning keyingi versiyalarini yangilash imkoni bo'lmaydi —
foydalanuvchilar ilovani o'chirib, qaytadan o'rnatishiga to'g'ri keladi.

---

## 5. Sinab ko'rish kerak bo'lgan joylar

APK tayyor bo'lgach, quyidagilarni albatta tekshiring — asosiy
o'zgarishlar shu joylarga tegdi:

- **"Qoidalar" (Rules) bo'limi** — ikkala video ijro etilyaptimi,
  biri bosilganda ikkinchisi to'xtayaptimi
- **"Mediator" bo'limi** — oltita shtrix videosi navbat bilan
  ishlayaptimi, pauza/davom tugmasi to'g'ri ishlayaptimi
- **Status bar** — sarlavha panel status bar ostiga kirib
  ketmayaptimi (ayniqsa Android 14/15 telefonda)
- **Audio bo'limlari** — kuylar va gammalar (bular o'zgarmadi,
  lekin nazorat uchun)

---

## 6. Kelajakda e'tiborga olish kerak

- **Play Store talabi:** Google har yili avgust oyida minimal
  targetSdk talabini oshiradi. Ilovani har 1–2 yilda yangilab turish kerak.
- **minSdk 21** hozircha saqlab qolindi, shuning uchun eski
  (Android 5.0+) telefonlarda ham ishlaydi. Agar keraksiz bo'lsa,
  uni 24 ga ko'tarish APK hajmini biroz kamaytiradi.
- **Ilova hajmi katta** (~100 MB) — audio va video fayllar tufayli.
  Play Store'ga yuklashda APK o'rniga **AAB** (Android App Bundle)
  ishlatilsa, foydalanuvchi yuklab oladigan hajm kamayadi:
  `./gradlew bundleRelease`.
