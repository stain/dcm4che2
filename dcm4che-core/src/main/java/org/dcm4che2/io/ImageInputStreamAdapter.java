/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), hosted at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Gunter Zeilinger, Huetteldorferstr. 24/10, 1150 Vienna/Austria/Europe.
 * Portions created by the Initial Developer are Copyright (C) 2002-2005
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4che2.io;

import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.ImageInputStream;

/**
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision: 5542 $ $Date: 2007-11-26 14:16:23 +0100 (Mon, 26 Nov 2007) $
 * @since Sep 2, 2006
 */
public class ImageInputStreamAdapter extends InputStream {

    private final ImageInputStream iis;

    private long markedPos;

    private IOException markException;

    public ImageInputStreamAdapter(ImageInputStream iis) {
        this.iis = iis;
    }

    @Override
    public int read() throws IOException {
        return iis.read();
    }

    @Override
    public synchronized void mark(int readlimit) {
        try {
            this.markedPos = iis.getStreamPosition();
            this.markException = null;
        } catch (IOException e) {
            this.markException = e;
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return iis.read(b, off, len);
    }

    @Override
    public synchronized void reset() throws IOException {
        if (markException != null)
            throw markException;
        iis.seek(markedPos);
    }

    @Override
    public long skip(long n) throws IOException {
        return iis.skipBytes((int) n);
    }
}
