/*
Copyright 2016 Hermann Krumrey <hermann@krumreyh.com>

This file is part of anitheme-dl.

anitheme-dl is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

anitheme-dl is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with anitheme-dl.  If not, see <http://www.gnu.org/licenses/>.
*/

package net.namibsun.anitheme.dl.lib.parsing

/**
 * An enum to model the different kinds of user lists on [themes.moe](https://themes.moe)
 *
 * Currently supported are:
 *
 * * [MyAnimeList](https://myanimelist.net)
 * * [Hummingbird](https://hummingbird.me)
 */
enum class ListTypes (val value: String) {
    MYANIMELIST("mal")
}
