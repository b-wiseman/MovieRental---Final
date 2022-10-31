/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.data

import com.example.lunchtray.constants.ItemType
import com.example.lunchtray.model.MenuItem

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {
    val menuItems = mapOf(
        "topgun" to
            MenuItem(
                name = "Top Gun Maverick",
                description = "Movie Description",
                price = 6.00,
                type = ItemType.ENTREE
            ),
        "bullettrain" to
            MenuItem(
                name = "Bullet Train",
                description = "Movie Description",
                price = 6.00,
                type = ItemType.ENTREE
            ),
        "uncutgems" to
            MenuItem(
                name = "Uncut Gems",
                description = "Movie Description",
                price = 6.00,
                type = ItemType.ENTREE
            ),
        "morbius" to
            MenuItem(
                name = "Morbius",
                description = "Movie Description",
                price = 6.00,
                type = ItemType.ENTREE
            ),
        "toystory" to
            MenuItem(
                name = "Toy Story",
                description = "Movie Description",
                price = 3.00,
                type = ItemType.ENTREE
            ),
        "ghostbusters" to
            MenuItem(
                name = "Ghostbusters",
                description = "Movie Description",
                price = 3.00,
                type = ItemType.ENTREE
            ),
        "3day" to
            MenuItem(
                name = "3-day Rental",
                description = "Return movie after 3 days",
                price = 3.00,
                type = ItemType.SIDE_DISH
            ),
        "7day" to
            MenuItem(
                name = "7-day Rental",
                description = "Return movie after 7 days",
                price = 6.00,
                type = ItemType.SIDE_DISH
            )
    )
}
