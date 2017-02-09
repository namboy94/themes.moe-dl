package net.namibsun.themes_moe_dl.lib.parsing
/*
Copyright Hermann Krumrey<hermann@krumreyh.com>, 2017

This file is part of themes.moe-dl.

themes.moe-dl is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

themes.moe-dl is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with themes.moe-dl.  If not, see <http://www.gnu.org/licenses/>.
*/


/**
 * Series is a class that models an anime Series on [themes.moe](https://themes.moe-dl)
 *
 * It consists of a name, which is displayed on [themes.moe](https://themes.moe-dl),
 * and a [List] of [Theme] objects attributed to this series.
 *
 * @param name The name of the series
 * @param themes The [List] of [Theme] objects attributed to this series
 */
class Series constructor(val name: String, val themes: List<Theme>) {

    /**
     * Downloads all theme songs of this series to a specified directory
     * Optionally converts the file into different formats
     *
     * @param target The target directory in which to save the files
     * @param fileTypes The fileTypes to convert the file into. Defaults to only .webm
     */
    fun download(target: String, fileTypes: Array<FileTypes> = arrayOf(FileTypes.WEBM)) {
        for (theme in this.themes) {
            theme.download(target, fileTypes)
        }
    }

    /**
     * Converts the [Series] object into a string for printing to the console
     *
     * The string is formatted like this:
     *
     *     Name: [Theme1, Theme2, Theme3, ...]
     *
     * @return the formatted [String]
     */
    override fun toString() : String {
        return "${this.name}: ${this.themes}"
    }

}