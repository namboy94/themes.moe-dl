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

package net.namibsun.anitheme.dl.cli

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

import java.util.logging.Level
import java.util.logging.LogManager
import java.util.logging.ConsoleHandler

/**
 * The Main method that starts the CLI
 *
 * First, the arguments are parsed and validated by the [ArgumentParser] class.
 * Afterwards, a [Downloader] interprets the arguments and downloads
 * theme songs accordingly
 *
 * @param args The Command Line Arguments
 */
fun main(args: Array<String>) {

    val argumentParser = ArgumentParser(args)
    val arguments = argumentParser.parse()

    if (arguments.hasOption("debug")) {
        val logger = LogManager.getLogManager().getLogger("")
        val handler = ConsoleHandler()
        handler.level = Level.FINE
        logger.level = Level.FINE
        LogManager.getLogManager().getLogger("").addHandler(handler)
    } else if (arguments.hasOption("verbose")) {
        // Default Logger Settings
    } else {
        LogManager.getLogManager().getLogger("").level = Level.OFF
    }

    val downloader = Downloader(arguments)
    downloader.download()
}
